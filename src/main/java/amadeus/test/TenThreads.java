package amadeus.test;

import java.io.IOException;
        import java.net.HttpURLConnection;
        import java.net.URL;
import java.util.Random;
import java.util.concurrent.ExecutorService;
        import java.util.concurrent.Executors;
        import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class TenThreads {
    private static final String API_ENDPOINT_1 = "https://test.getfeasy.com/services/client/api/v3/advertisement?recloc=";
    private static final String API_ENDPOINT_2 = "&encodedConsentString=abc&height=340&width=520";
    private static final String BEARER_TOKEN = "eyJlbmMiOiJBMjU2Q0JDLUhTNTEyIiwiYWxnIjoiZGlyIn0..NIXqXPwf7E0j6Fmbx6E9Hw.Ri6A4AWNjLL1OBZvsE6jlRrh9dwHv0iVmPxgd_eqshQh8gyeuRjP32lqbI4ZOGzRTdF1Yj6s2WjnM4O2ljvHiecNNLSzbJWxnzCydLU_Hv9bvKYU6plhV5ex9ZdqTg88OPi0f4GLuZPN6wYAqKZLLhsT7V71oqcJuhVlNl4HDnnV4ctLDMnPWiIXDvhZmwPwtgtyf5pumA2Z6w2zECOcVhNdyfmJH1wjF98Afa_yXc3btS5MbIi5FLSJmuMorN234gjF7dr94ttTbBPT6lNNcg.MZRWw7Xli4kxnTTF_92a0jlBLt4hpZCtTxeD4Gc4udY";
    private static final AtomicInteger threadNumber = new AtomicInteger(1);
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 500; i++) {
            //int threadId = threadNumber.getAndIncrement();
            executor.submit(() -> {
                //System.out.println("Executing thread number: " + threadId);
                for (int j = 0; j < 10; j++) {
                    String url = API_ENDPOINT_1 + generateRandomString() + API_ENDPOINT_2;
                    long startTime = System.nanoTime();
                    callAPI(url);
                        long endTime = System.nanoTime();
                        long duration = (endTime - startTime);
                        long milli = TimeUnit.NANOSECONDS.toMillis(duration);
                        //System.out.println("API call took " + duration + " nanoseconds");
                        System.out.println("API call took " + milli + " milliseconds");
                }
            });
        }

        executor.shutdown();
        try {
            if (!executor.awaitTermination(60, TimeUnit.MINUTES)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException ex) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    private static void callAPI(String testURL) {
        try {
            URL url = new URL(testURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + BEARER_TOKEN);
            int responseCode = conn.getResponseCode();
            //System.out.println("Response Code : " + responseCode);
            conn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String generateRandomString() {
        int length = 6;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }

        return sb.toString();
    }
}


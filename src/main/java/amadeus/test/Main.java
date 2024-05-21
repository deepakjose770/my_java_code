package amadeus.test;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

    }

    public void callRequest() {
        String jsonBody = "{\"_pnr\": \"QD2PBD\", \"_Tag_ID\": \"CMT_PNR\"}";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://pdt.advertising.media-solutions.aaas.amadeus.com:443/get-ad?token=1a-token&height=340&width=520&format=html"))
                .header("Content-Type", "text/plain")
                .POST(BodyPublishers.ofString(jsonBody))
                .build();

        try {
            long startTime = System.nanoTime();
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            long milli = TimeUnit.NANOSECONDS.toMillis(duration);
            //System.out.println("API call took " + duration + " nanoseconds");
            System.out.println("API call took " + milli + " milliseconds");


            //System.out.println("Status code: " + response.statusCode());
            //System.out.println("Response body: " + response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
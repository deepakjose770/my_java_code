package EasyQ;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {
    public static void main(String[] args) {
        String word = "loveleetcode";
        System.out.println(firstUniqChar(word));
        System.out.println(firstUniqCharOptimized(word));
    }

    private static int firstUniqCharOptimized(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, (freqMap.getOrDefault(c, 0)+1));
        }
        for (int i = 0; i < s.length(); i++) {
            if(freqMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    private static int firstUniqChar(String word) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int frequency = freqMap.getOrDefault(c, 0);
            freqMap.put(c, (frequency+1));
        }
        for (int i = 0; i < word.length(); i++) {
            if(freqMap.get(word.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}

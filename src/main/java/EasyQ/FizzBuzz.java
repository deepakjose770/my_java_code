package EasyQ;

import java.util.ArrayList;
import java.util.List;
//Asked by Linkedin
//LC412
public class FizzBuzz {
    public static void main(String[] args) {
        int n =15;
        System.out.println(fizzBuzz(n));
    }

    private static List<String> fizzBuzz(int n) {
        List<String> outList = new ArrayList<>();
        for (int i = 1, fizz= 0, buzz=0; i <= n; i++) {
            fizz++;
            buzz++;
            if(fizz == 3 && buzz ==5) {
                fizz =0;
                buzz =0;
                outList.add("FizzBuzz");
            } else if (fizz == 3) {
                fizz=0;
                outList.add("Fizz");
            } else if (buzz == 5) {
                buzz = 0;
                outList.add("Buzz");
            } else {
                outList.add(String.valueOf(i));
            }
        }
        return outList;
    }

    /*private static List<String> fizzBuzzWithSwitch(int n) {
        return switch ((i + 1) % 15) {
            case 0 -> "FizzBuzz";
            case 3, 6, 9, 12 -> "Fizz";
            case 5, 10 -> "Buzz";
            default -> String.valueOf(i + 1);
        };
    }*/
}

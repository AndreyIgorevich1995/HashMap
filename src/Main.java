import java.util.HashMap;
import java.util.Map;

public class Main {
    static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
            " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
            " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat." +
            " Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur." +
            " Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    static int a = 1;
    static String b = "Hello world!!!";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            //char c = b.charAt(i);;
            if (Character.isLetter(text.charAt(i))) {
                if (!map.containsKey(text.charAt(i))) {
                    map.put(text.charAt(i), a);
                } else {
                    map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
                }
            }
        }
        int maxNum = 1;
        int minNum = Integer.MAX_VALUE;
        for (int value : map.values()) {
            if (value > maxNum)
                maxNum = value;
        }
        for (int value : map.values()) {
            if (value < minNum)
                minNum = value;
        }
        System.out.println(map);
        System.out.println(maxNum);
        System.out.println(minNum);
    }
}
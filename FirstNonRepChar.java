import java.util.*;

public class FirstNonRepChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        boolean found = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (countMap.get(c) == 1) {
                System.out.println(c);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("$");
        }
        sc.close();
    }
}
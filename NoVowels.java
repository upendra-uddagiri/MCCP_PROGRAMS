import java.util.Scanner;
public class NoVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split("#");   
        for (String word : words) {
            if (hasNoVowels(word)) {
                System.out.println(word);
            }
        }
        sc.close();
    }
    public static boolean hasNoVowels(String word) {
        String lower = word.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return false;
            }
        }
        return true;
    }
}
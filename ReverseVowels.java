
import java.util.*;

class ReverseVowels {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String s = sc.next();
        int n = s.length() - 1;
        char a[] = s.toCharArray();
        int i = 0;
        while (i < n) {
            while (i < n && "aeiou".contains("" + a[i]) == false) {
                i++;
            }
            while (i < n && "aeiou".contains("" + a[n]) == false) {
                n--;
            }
            if (i < n) {
                char ch = a[i];
                a[i] = a[n];
                a[n] = ch;
            }
            i++;
            n--;
        }
        System.out.println("final string is " + String.valueOf(a));
    }
}

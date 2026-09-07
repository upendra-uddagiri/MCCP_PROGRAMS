
import java.util.*;

class L_U_U_L {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String s = sc.next();
        int n = s.length();
        char a[] = s.toCharArray();
        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(a[i])) {
                a[i] = Character.toLowerCase(a[i]);
            } else {
                a[i] = Character.toUpperCase(a[i]);
            }
        }
        System.out.println("final string is " + String.valueOf(a));
    }
}

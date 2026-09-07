
import java.util.*;

class ToUpperCase {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String s = sc.nextLine();
        String a[] = s.split(" ");
        StringBuilder rs=new StringBuilder();
        for(String w:a)
        {
            rs.append(Character.toUpperCase(w.charAt(0)));
        }
        System.out.println("final string is " + rs.toString());
    }
}

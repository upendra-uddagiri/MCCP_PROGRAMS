import java.util.*;
public class Main8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter position:");
        int k=sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            b[i] = a[(i + k) % n];
        for (int x : b)
            System.out.println(x);
        sc.close();
    }
}
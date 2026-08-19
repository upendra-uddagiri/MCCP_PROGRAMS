import java.util.*;
public class LeaderOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> res = new ArrayList<>();
        int max = a[n - 1];
        res.add(max);
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > max) {
                max = a[i];
                res.add(a[i]);
            }
        }
        Collections.reverse(res);
        System.out.println("answer:");
        for (Integer x : res)
            System.out.println(x);
        sc.close();
    }
}
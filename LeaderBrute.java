import java.util.*;
public class LeaderBrute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter array:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean leader = true;
            for (int j = i + 1; j < n; j++) {
                if (a[i] <= a[j]) {
                    leader = false;
                    break;
                }
            }
            if (leader)
                res.add(a[i]);
        }
        System.out.println("answer:");
        for (Integer x : res)
            System.out.println(x);
        sc.close();
    }
}
import java.util.*;
public class Main9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        for (int i=1;i<=n;i++)
            ans^=i;
        for (int i=0;i<n-1;i++)
            ans^=sc.nextInt();
        System.out.println(ans);
        sc.close();
    }
}
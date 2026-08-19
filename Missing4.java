import java.util.Scanner;

public class Missing4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n-1];
        for(int i=0;i<n-1;i++)
            arr[i]=sc.nextInt();
        boolean h[]=new boolean[n+1];
        for(int i=0;i<n-1;i++)
            h[arr[i]]=true;
        for(int i=1;i<=n;i++)
            if(!h[i])
                System.out.println("missing ele : "+i);
        sc.close();
    }
}
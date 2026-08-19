import java.util.Scanner;

public class Missing3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n-1];
        for(int i=0;i<n-1;i++)
            arr[i]=sc.nextInt();
        int h[]=new int[n+1];
        for(int i=0;i<n-1;i++)
            h[arr[i]]++;
        for(int i=1;i<=n;i++)
            if(h[i]==0)
             System.out.println("missing ele : "+i);
        sc.close();
    }
}
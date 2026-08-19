import java.util.Scanner;

public class SuffixSum {
  public static void main(String[] ars){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    for(int i=n-1;i>0;i--){
      arr[i-1]+=arr[i];
    }
    for(int x:arr)
      System.out.print(x+" ");
    sc.close();
  }
  
}

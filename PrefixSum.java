import java.util.Scanner;

public class PrefixSum {
  public static void main(String[] ars){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    int sum=0;
    for(int i=0;i<n;i++){
      arr[i]=sum+sc.nextInt();
      sum=arr[i];
    }
    for(int x:arr)
      System.out.print(x+" ");
    sc.close();
  }
}

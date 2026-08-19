import java.util.*;
public class EquilibriumOp {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("enter array");
    int sum=0;
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      sum+=a[i];
    }
    int lsum=a[0];
    sum-=a[0];
    int i;
    for(i=1;i<n-1;i++){
      sum-=a[i];
      if(sum==lsum){
        System.out.println("answer:"+i);
        break;
      }
      lsum+=a[i];
    }
    if(i>=n-1)
      System.out.println(-1);
    sc.close();
  }
}

import java.util.*;
public class EquilibriumBrute {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int[] a=new int[n];
  for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
  }
  for(int i=1;i<n-1;i++){
    int lsum=0;
    for(int j=0;j<i;j++)
      lsum+=a[j];
    int rsum=0;
    for(int j=i+1;j<n;j++)
      rsum+=a[j];
    if(lsum==rsum)
      System.out.println("answer:"+i);
  }
  sc.close();
  }
}

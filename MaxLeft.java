import java.util.*;
public class MaxLeft {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    ArrayList<Integer> res=new ArrayList<>();
    int max=0;
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      if(arr[i]>max){
        res.add(arr[i]);
        max=arr[i];
      }
    }
    System.out.println("ans:"+res.size());
    sc.close();
 }
}

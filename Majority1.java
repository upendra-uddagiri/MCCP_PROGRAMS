import java.util.*;
public class Majority1 {
  public static int majority(int[] arr,int n){
    HashMap<Integer,Integer> res=new HashMap<>();
    for(int i=0;i<n;i++){
      res.put(arr[i],res.getOrDefault(arr[i],0)+1);
      if(res.get(arr[i])>n/2)
        return arr[i];
    }
    return -1;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    System.out.println(majority(arr,n));
    sc.close();
  }
}

import java.util.*;
public class Majority4 {
  public static int majority(int[] arr,int n){
    ArrayList<Integer> res=new ArrayList<>();
    LinkedHashMap<Integer,Integer> res1=new LinkedHashMap<>();
    for(int i=0;i<n;i++){
      res1.put(arr[i],res1.getOrDefault(arr[i],0)+1);
      if(res.get(arr[i])>Math.floor(n/3))
        res.add(arr[i]);
    }
    return res.size();
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

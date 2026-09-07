import java.util.*;
public class MaxChar {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    HashMap<Character,Integer> count=new HashMap<>();
    char[] st=s.toCharArray();
    for(char x:st){
      count.put(x,count.getOrDefault(x, 0)+1);
    }
    int max=0;
    char maxchar='a';
    Set<Character> res=count.keySet();
    for(Character x:res){
      int c=count.get(x);
      if(c>max){
        max=c;
        maxchar=x;
      }
    }
    System.out.println(maxchar);
    sc.close();
  }
  
}

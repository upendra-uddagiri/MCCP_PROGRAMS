import java.util.*;
public class FirstRepChar {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    HashSet<Character> res=new HashSet<>();
    int i=0;
    for(i=0;i<s.length();i++){
      if(res.contains(s.charAt(i))){
        System.out.println(s.charAt(i));
        break;
      }
      res.add(s.charAt(i));
    }
    if(i>=s.length()-1)
      System.out.println("no character found");
    sc.close();
  }
}

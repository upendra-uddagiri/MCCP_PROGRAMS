import java.util.*;
public class Encrypt1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    Map<Character, Integer> countMap = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      countMap.put(c, countMap.getOrDefault(c, 0) + 1);
    }
    sc.close();
    for(Map.Entry<Character,Integer> e:countMap.entrySet())
      System.out.print(e.getKey()+""+e.getValue());
  }
}

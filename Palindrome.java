import java.util.*;
public class Palindrome {
  public static boolean twoPointer(String s){
    int left=0,right=s.length()-1;
    while(left<right){
      if(s.charAt(left)!=s.charAt(right))
        return false;
      left++;
      right--;
    }
    return true;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    System.out.println("Two pointer");
    if(twoPointer(s))
      System.out.print("palindrome");
    else
      System.out.print("not a palindrome");
    sc.close();
  }
}

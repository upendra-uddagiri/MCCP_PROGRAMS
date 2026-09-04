import java.util.*;
public class noVowelWords {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String[] res=s.split(" ");
    int count=0;
    for(String word:res){
      boolean vowel=false;
      for(int i=0;i<word.length();i++) {
                char ch = Character.toLowerCase(word.charAt(i));
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                    vowel=true;
                    break;
                }
            }
            if(!vowel)
              count++;
    }
    System.out.println(count);
    sc.close();
  }
}

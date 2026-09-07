import java.util.*;

class RemoveDupVal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        String s=sc.next();
        int a[]=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            a[s.charAt(i)-'a']++;
        }
        StringBuilder rs=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            if(a[s.charAt(i)-'a']==1)
            {
                rs.append(s.charAt(i));
            }
        }
        System.out.println("final string is "+rs.toString());
    }
}
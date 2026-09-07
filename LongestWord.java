import java.util.*;

class LongestWord
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        String a[]=new String[n];
        String rs="";
        int max=0;
        System.out.println("enter string values to the array ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.next();
            if(a[i].length()>max)
            {
                rs=a[i];
                max=a[i].length();
            }
        }
        System.out.println("longest String in the array is "+rs+" with size "+max);
    }
}
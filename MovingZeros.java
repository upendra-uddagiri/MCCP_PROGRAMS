import java.util.*;
class MovingZeros
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int t[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}

		int c=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=0)
			{
				t[c++]=a[i];
			}	
		}
		for(int i:t)
		System.out.print(i+" ");
  sc.close();
	}
}
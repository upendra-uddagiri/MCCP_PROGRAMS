import java.util.*;
class MovingZerosOp
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}

		int c=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=0)
			{
				int t=a[c];
				a[c]=a[i];
				a[i]=t;
				c++;
			}	
		}
		for(int i:a)
		System.out.print(i+" ");
  sc.close();
	}
}
package ramu;
import java.util.*;
public class crc {
	void div(int a[],int k)
	{
		int gp[]= {1,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,1};
		int count=0;
		for(int i=0;i<k;i++)
		{
			if(a[i]==gp[0])
			{
				for(int j=i;j<17+i;j++)
				{
					a[j]=a[j]^gp[count++];
				}
				count=0;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[100];
		int b[]=new int[100];
		int len,k;
		crc ob=new crc();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		len=sc.nextInt();
		System.out.println("Enter the message");
		for(int i=0;i<len;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<16;i++)
		{
			a[len++]=0;
		}
		k=len-16;
		for(int i=0;i<len;i++)
		{
			b[i]=a[i];
		}
		ob.div(a,k);
		for(int i=0;i<len;i++)
			a[i]=a[i]^b[i];
		System.out.println("Data to be transmitted is");
		for(int i=0;i<len;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the receivrd data");
		for(int i=0;i<len;i++)
		{
			a[i]=sc.nextInt();
		}
		ob.div(a, k);
		for(int i=0;i<len;i++)
		{
			if(a[i]==0)
			{
				System.out.println("NO ERROR");
				return;
			}
			System.out.println("no error");
			sc.close();
		}
	}

}

package ramling;
import java.util.Scanner;
public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
	    n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		double count=0.0,sum=0.0;
		for( i=0;i<n;i++)
		{
			if(a[i]%2==1)
			{
			sum=sum+a[i];
			count++;
			}
			
		}
		double avg;
		if(sum==0)
			avg=0;
		else
		 avg=sum/count;
		System.out.println(avg);

	}

}

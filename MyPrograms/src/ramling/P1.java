package ramling;
import java.util.Scanner;
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,m,n,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		n=sc.nextInt();
		m=n/2;
		if(n==0||n==1)
		{
			System.out.println("This is not a prime number");
		}
		else
		{
		for(i=2;i<=m;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+"is not a prime number");
				flag=1;
				break;
			}
			
		}
		
		if(flag==0)
		{
			System.out.println(n+"is a prime number");
		}
		}

	}

}

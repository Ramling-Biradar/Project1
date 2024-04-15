package ramling;
import java.util.Scanner;
public class SimpleFactorial
{
	public static void main(String []args)
	{
		int n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+ n + "is "+fact);
	}
}
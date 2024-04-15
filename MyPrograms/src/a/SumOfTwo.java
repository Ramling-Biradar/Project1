package a;
import java.util.Scanner;
public class SumOfTwo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,sum;
		System.out.println("Enter the value of a");
		a=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		sum=a+b;
		System.out.print("Sum of "+a+" and "+b+" is :"+sum);
	}

}

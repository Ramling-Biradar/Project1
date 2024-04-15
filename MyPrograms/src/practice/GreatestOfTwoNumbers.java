package practice;
import java.util.Scanner;
public class GreatestOfTwoNumbers {
	public static void main(String[] h)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println(num1+" is largest");
		}
		else
		{
			System.out.println(num2+" is largest");
	}
	}

}

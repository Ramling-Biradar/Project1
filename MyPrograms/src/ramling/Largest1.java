package ramling;
import java.util.Scanner;
public class Largest1 {
	public static void main(String[] args)
	{
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1");
		num1=sc.nextInt();
		System.out.println("Enter num2");
		num2=sc.nextInt();
		System.out.println("Enter num3");
		num3=sc.nextInt();
		sc.close();
		//using else-if ladder
		if(num1>num2&&num1>num3)
			System.out.println(num1+"is largest");
		else if(num2>num1&&num2>num3)
			System.out.println(num2+"is largest");
		else
			System.out.println(num3+"is larrgest");
		
		
		
	}

}

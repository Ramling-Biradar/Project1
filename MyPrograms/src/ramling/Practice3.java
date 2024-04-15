package ramling;
import java.util.Scanner;
public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("It is not prime number");
		else
			System.out.println("it is prime");

	}

}

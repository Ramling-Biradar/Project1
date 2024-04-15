package ramling;
import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=60,b=90,c=50;
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		System.out.println("Enter c");
		c=sc.nextInt();
		sc.close();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+"is largest in given numbers");
			}
			else
			{
				System.out.println(c+"is largest in given numbers");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(b+"is largest in given numbers");
			}
			else
			{
				System.out.println(c+"is largest in given numbers");
			}
		}

	}

}

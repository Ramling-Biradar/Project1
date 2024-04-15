package ramling;
import java.util.Scanner;
public class P35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		System.out.println("Enter c");
		c=sc.nextInt();
		if(a<=b)
		{
			if(a<=c)
				System.out.println(a+" is smallest");
			else
				System.out.println(c+" is smallest");
		}
		if(b<=c)
		{
			if(b<=a)
				System.out.println(b+"is smallest");
			else
				System.out.println(c+"is smallest");
		}
		

	}

}

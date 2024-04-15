package ramling;
import java.util.Scanner;
public class P34 {

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
		if(a>b&&a>c)
			System.out.println(a+" is greatest");
		else if(b>a&&b>c)
			System.out.println(b+" is greatest");
		else
			System.out.println(c+" is greatest");
		

	}

}

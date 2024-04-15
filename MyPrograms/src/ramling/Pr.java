package ramling;
import java.util.Scanner;
public class Pr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a");
		a=sc.nextInt();
		b=a+3;
		System.out.println("b="+b);
		c=(a*b)+a;
		System.out.printf("%d+%d =%d",a,b,c);
	}

}

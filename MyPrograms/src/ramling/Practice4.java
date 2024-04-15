package ramling;
import java.util.Scanner;
public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p,t,r,si;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter p,t,r");
		p=sc.nextDouble();
		t=sc.nextDouble();
		r=sc.nextDouble();
		si=p*t*r/100;
		System.out.println("simple intrest is "+si);

	}

}

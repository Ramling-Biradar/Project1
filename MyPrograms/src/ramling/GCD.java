package ramling;
import java.util.Scanner;
public class GCD {
	int gcd(int m,int n)
	{
		if(m==0)
			return n;
		if(n==0)
			return m;
		if(m>n)
			return gcd(m%n,n);
		else
			return gcd(m,n%m);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;
		GCD g=new GCD();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of m and n");
		m=sc.nextInt();
		n=sc.nextInt();
		int result=g.gcd(m, n);
		System.out.println("The gcd of " +m+ " and "+n+ " is :"+result);
	
		
		

	}

}

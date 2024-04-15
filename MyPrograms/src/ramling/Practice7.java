package ramling;
import java.util.Scanner;
public class Practice7 {
	int gcd(int m,int n)
	{
		if(m==0)
			return n;
		if(n==0)
			return m;
		if(m>n)
			return gcd(m%n,m);
		else
			return gcd(m,n%m);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;
		Practice7 g=new Practice7();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of m and n");
		m=sc.nextInt();
		n=sc.nextInt();
		int result=g.gcd(m,n);
		System.out.println("gcd of given numbers is : "+result);
		

	}

}

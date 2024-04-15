package practice;
import java.util.Scanner;
public class Factorial {
	static int fact(int n)
	{
		if(n==0)
			return 1;
		else if(n==1)
			return 1;
		else
			return n*fact(n-1);
	}

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		int res;
		res=fact(n);
		System.out.println("The Factorial of "+n+" is :"+res);
		sc.close();
		

	}

}

package ramling;
import java.util.Scanner;
public class FibanocciSeries {
	int fib(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return (fib(n-1)+fib(n-2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibanocciSeries f=new FibanocciSeries();
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		n=sc.nextInt();
		int result=f.fib(n);
		System.out.println("The fibanocci value of "+n+" is :"+result);

	}

}

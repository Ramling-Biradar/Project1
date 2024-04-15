package ramling;
import java.util.Scanner;
public class Fi1 {
	int fib(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else 
			return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Fi1 f=new Fi1();
		int result=f.fib(n);
		System.out.println(result);
		
		
	}

}

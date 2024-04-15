package ramling;
import java.util.Scanner;
public class RecursiveFact {
	int fact(int n)
	{
		if(n==0)
			return 1;
		else
			return(n*fact(n-1));
	}
		
public static void main(String[] arga)
{

	// TODO Auto-generated method stub
		RecursiveFact r=new RecursiveFact();
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		n=sc.nextInt();
		int factorial=r.fact(n);
		System.out.println("Factorial of "+ n +" is : "+factorial);
		

	}

}

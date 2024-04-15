package a;
import java.util.Scanner;
public class prime {
	 static void primecheck(int n)
	{
		 for(int i=2;i<=n/2;i++)
		 {
			 if(n%i==0)
			 {
				 System.out.println(n+" is not a prime number");
				 break;
			 }
			 else
			 {
				 System.out.println(n+" is a prime number");
				 
			 }
			 
		 }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primecheck(11);

	}

}

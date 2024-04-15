package ramling;
import java.util.Scanner;
public class P23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int ld,rev=0;
		int temp=n;
		while(n!=0)
		{
			ld=n%10;
			rev=rev*10+ld;
			n=n/10;
					
			
		}
		System.out.println("The reverse of "+temp+" is :"+rev);
		
		

	}

}

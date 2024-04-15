package ramling;
import java.util.Scanner;
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,digit,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		n=sc.nextInt();
		int temp=n;
		while(n!=0)
		{
			digit=n%10;
			rev=rev*10+digit;
			n=n/10;
			
			
		}
		System.out.println("reverse of "+temp+" is :"+rev);
		if(temp==rev)
		{
			System.out.println(temp+" is palindrome number ");
			
		}
		else
		{
			System.out.println(temp+" is not a  palindrome number ");
			
		}

        
	}
}

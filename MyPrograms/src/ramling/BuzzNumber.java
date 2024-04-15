package ramling;
import java.util.Scanner;
public class BuzzNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any integer");
		int num=sc.nextInt();
		if(num%10==7||num%7==0)
		{
			System.out.println(num+" is a buzz number");
		}
		else
		{
			System.out.println(num+" is not a buzz number");
		}

	}

}

package ramling;
import java.util.Scanner;
public class CheckPerfectSquareExample1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n>0)
			System.out.println(n+" is positive");
		else if(n<0)
			System.out.println(n+" is negative");
		else
			System.out.println(+n+" is zero");
			
			

	}

}

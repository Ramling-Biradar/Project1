package ramling;
import java.util.Scanner;
public class CheckPerfectSquareExample {
	static boolean CheckPerfectSquareExample1(double number)
	{
		double sqrt=Math.sqrt(number);
		return (sqrt-Math.floor(sqrt))==0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number");
		double number=sc.nextInt();
		if(CheckPerfectSquareExample1(number))
		{
			System.out.println("perfect square");
		}
		else
			System.out.println("not perfect square");
			
				

	}

}

package ramling;
import java.util.Scanner;
public class P30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check");
		n=sc.nextInt();
		double s=Math.sqrt(n);
		double f=Math.floor(s);
		System.out.println(s);
		System.out.println(f);
		if(s==f)
			System.out.println("The number is perfect square");
		else
			System.out.println("The number is not a perfect square");
			

	}

}

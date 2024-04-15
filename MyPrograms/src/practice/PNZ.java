package practice;
import java.util.Scanner;
public class PNZ {

	public static void main(String[] args) {
		double num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextDouble();
		if(num==0)
			System.out.println(num+" is zero");
		else if(num>0)
			System.out.println(num+" is positive");
		else
			System.out.println(num+" is negative");
		sc.close();
		
		
		
	}

}

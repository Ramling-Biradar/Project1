package ramling;
import java.util.Scanner;
public class MaximunOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers to find maximum ");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
			System.out.printf("between %d and %d The maximum is : %d",a,b,a);
		else if(a==b)
		System.out.println("Both numbers are equal");
		else
			System.out.printf("beteween %d and %d The maximum is : %d",a,b,b);
			
		
}

}

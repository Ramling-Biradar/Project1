package ramling;
import java.util.Scanner;
public class ArmStongNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,n,ld,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
         num=sc.nextInt();
		System.out.println("Enter the number of digits in your number");
		n=sc.nextInt();
		sc.close();
		int temp=num;
		while(num!=0)
		{
			ld=num%10;
			sum+=Math.pow(ld,n);
			num=num/10;
			
		}
		System.out.println("The generated number is:"+sum);
		if(temp==sum)
		{
			System.out.println(temp+" "+"is an ArmStongNumber");
			
		}
		else
		{
			System.out.println(temp+" "+"is not an ArmStongNumber ");
		}

	}

}

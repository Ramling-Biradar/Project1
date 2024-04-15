package ramling;
import java.util.Scanner;
public class XP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,extreme_sum=0,mean_sum=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		num=sc.nextInt();
		num=Math.abs(num);
		n=num;
		while(n!=0)
		{
			if(n==num||n<10)
			{
				extreme_sum=extreme_sum+n%10;
			}
			else
			{
				mean_sum=mean_sum+n%10;
			}
			n=n/10;
		}
		System.out.println("extreme_sum :"+extreme_sum);
		System.out.println("mean_sum :"+mean_sum);
		if(extreme_sum==mean_sum)
		{
			System.out.println(num+" is a xylem number");
		}
		else
		{
			System.out.println(num+" is a phloem  number");
		}
		

	}

}

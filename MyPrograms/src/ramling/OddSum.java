package ramling;
import java.util.Scanner;
public class OddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		int sum=0,num=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+num;
			num=num+2;
		}
		System.out.println(sum);

	}

}

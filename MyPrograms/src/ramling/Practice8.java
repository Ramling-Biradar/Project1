package ramling;
import java.util.Scanner;
public class Practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,num=1;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+num;
			num=num+1;
		}
		System.out.println(sum);
		

	}

}

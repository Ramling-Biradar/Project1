package ramling;
import java.util.Scanner;
public class P28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("sum from");
		m=sc.nextInt();
		System.out.println("sum upto");
		n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		

	}

}

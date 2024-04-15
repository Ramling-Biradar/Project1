package ramling;
import java.util.Scanner;
public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,digits=0,last,temp,lastd;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		n=sc.nextInt();
		temp=n;
		while(temp!=0)
		{
			temp=temp/10;
			digits++;
			
		}
		temp=n;
		while(temp!=0)
		{
			lastd=temp%10;
			sum+=Math.pow(lastd,digits);
			temp=temp/10;
			
		}
		System.out.println(sum);
		if(n==sum)
			System.out.println(n+" is an armstrong number");
		else
			System.out.println(n+" is not an armstrong number");
		

	}

}

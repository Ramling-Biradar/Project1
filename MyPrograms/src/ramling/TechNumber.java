package ramling;
import java.util.Scanner;
public class TechNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,digits=0,fh,lh,square;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number");
		n=sc.nextInt();
		int num=n;
		while(num>0)
		{
			digits++;
			num=num/10;
		}
		if(digits%2==0)
		{
			num=n;
			fh=num%(int)Math.pow(10,digits/2);
			lh=num/(int)Math.pow(10,digits/2);
			System.out.println(fh+" "+lh);
			square=(fh+lh)*(fh+lh);
			if(square==n)
			{
				System.out.println(n+" is a tech number");
			}
			else
			{
				System.out.println(n+" is not a tech number");
			}
				
			
		}
		else
		{
			System.out.println(n+" is  not a tech number");
		}
		

	}

}

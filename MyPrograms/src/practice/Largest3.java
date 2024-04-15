package practice;
import java.util.Scanner;
public class Largest3 {

	public static void main(String[] args) {
		int p,q,r;
		System.out.println("Enter p,q  and r");
		Scanner sc=new Scanner(System.in);
		p=sc.nextInt();
		q=sc.nextInt();
		r=sc.nextInt();
		if(p>q&&p>r)
		{
			System.out.println(p+" is largest among three numbers");
				
		}
		else if(p<q&&q>r)
		{
			System.out.println(q+" is largest among three numbers");
				
		}
		else 
		{
			System.out.println(r+" is largest among three numbers");
				
		}
		sc.close();

	}

}

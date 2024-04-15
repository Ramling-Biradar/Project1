package ramling;
import java.util.Scanner;
public class P32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c,temp,smallest;
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		System.out.println("Enter c");
		c=sc.nextInt();
		temp=(a<b)?a:b;
		smallest=(c<temp)?c:temp;
		System.out.println("The smallest number among "+a+","+b+" and "+c+" is :"+smallest);
		
		

	}

}

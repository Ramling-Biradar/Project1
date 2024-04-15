package ramling;
import java.util.Scanner;
public class P33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,smallest;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a");
		a=s.nextInt();
		System.out.println("Enter b");
		b=s.nextInt();
		System.out.println("Enter c");
		c=s.nextInt();
		smallest=c<(a<b?a:b)?c:((a<b)?a:b);
		System.out.println(smallest);
		

	}

}

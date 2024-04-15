package practice;
import java.util.Scanner;
public class CoOrdinate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two points ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x>0&&y>0)
		{
			System.out.println("The Point is in 1st qudrant");
			
		}
		else if(x<0&&y>0)
		{
			System.out.println("The Point is in 2nd qudrant");
			
		}
		else if(x<0&&y<0)
		{
			System.out.println("The Point is in 3rd qudrant");
			
		}
		else if(x>0&&y<0)
		{
			System.out.println("The Point is in 4th qudrant");
			
		}
		else if(x==0 && y==0)
		{
			System.out.println("The Point is at origin");
			
		}
		else if(x==0 && (y>0 || y<0))
		{
			System.out.println("The Point is on y axis");
			
		}
		else
		{
			System.out.println("The Point is on x axis");
			
		}

	}

}

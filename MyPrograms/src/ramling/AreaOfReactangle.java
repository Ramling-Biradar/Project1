package ramling;
import java.util.Scanner;
public class AreaOfReactangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length");
		double length=sc.nextDouble();
		sc.close();
		System.out.println("Enter Breadth");
		double breadth=sc.nextDouble();
		double area=length*breadth;
		System.out.println("Area of the reactangle is:"+area);
		
		
		

	}

}

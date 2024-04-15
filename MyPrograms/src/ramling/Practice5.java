package ramling;
import java.util.Scanner;
public class Practice5 {
	double p,t;
	double r,si;
	public void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principal Amount");
		p=sc.nextDouble();
		System.out.println("Enter the Rate");
		r=sc.nextDouble();
		System.out.println("Enter the time in terms of years");
		t=sc.nextDouble();
		sc.close();
	}
	public void SI()
	{
		si=(p*t*r)/100;
		//System.out.println("The Simple Intrest is")
		
	}
	public void display() {
		System.out.println("The simple intrest is: "+si);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice5 p=new Practice5();
		p.getdata();
		p.SI();
		p.display();
		

	}

}

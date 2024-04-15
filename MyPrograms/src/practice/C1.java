package practice;
import java.util.Scanner;
public class C1 {

	public static void main(String[] args) {
		float p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your percentage");
		p=sc.nextFloat();
		if(p>=71&&p<=100)
			System.out.println("Grade A");
		else if(p>=60&&p<=71)
			System.out.println("Grade B+");
		else if(p>=45&&p<=61)
			System.out.println("Grade B");
		else if(p>=35&&p<=44)
			System.out.println("Grade c");
		else
			System.out.println("fail");
		sc.close();
		
		
		
		
			
	}

}

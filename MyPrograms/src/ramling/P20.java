package ramling;
import java.util.Scanner;
public class P20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		System.out.println("Enter any charchter");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		System.out.println("The Ascii value of "+ch+"is :");
		System.out.println((int)ch);

	}

}

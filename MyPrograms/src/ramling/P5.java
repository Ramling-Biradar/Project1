package ramling;
import java.util.Scanner;
//Reverse of the string
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,revst="";
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		name=sc.nextLine();
		int len=name.length();
		for(i=len-1;i>=0;i--)
		{
			revst=revst+name.charAt(i);
		}
		System.out.println("The reverse "+name+" is :"+revst);
		if(name.equals(revst))
		{
			System.out.println(name+" is a palindrome");
		}
		else
		{
			System.out.println(name+" is not a palindrome string");
		}
		

	}

}

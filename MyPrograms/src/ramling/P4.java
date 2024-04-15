package ramling;
import java.util.Scanner;
public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string,revs="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		string=sc.nextLine();
		int len=string.length();
		for(int i=len-1;i>=0;i--)
		{
			revs=revs+string.charAt(i);
		}
		System.out.println(revs);
		if(string.equals(revs))
		{
			System.out.println("palindrome");
			
		}
			
		else
		{
			System.out.println("Not palindrome");
		}

	}

}

package ramling;
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter c");
		c=sc.next().charAt(0);
		char []vow= {'a','e','i','o','u','A','E','I','O','U'};
		for(int x:vow)
		{
			if(x==c)
				flag=1;
			
		}
		if(flag==1)
			System.out.println("vowel");
		else 
			System.out.println("Not vowel");

	}

}

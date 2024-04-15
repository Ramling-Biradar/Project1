package ramling;
import java.util.Scanner;
public class P25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		int square=temp*temp;
		count=(""+num).length();
		int end=square%(int)Math.pow(10,count);
		if(num==end)
		{
			System.out.println("Automorphic");
		}
		else
		{
			System.out.println("Not Automorphic");
		}
			
		}
		
		
		
		

	}


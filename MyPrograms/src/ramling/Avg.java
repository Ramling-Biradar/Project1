package ramling;
import java.util.Scanner;
public class Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The array size");
		n=sc.nextInt();
		double a[]=new double[n];
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextDouble();
		}
		double sum=0,avg=0;
		for(i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/n;
		System.out.println("The sum is: "+sum);
		System.out.println("The average is : "+avg);
		

	}

}

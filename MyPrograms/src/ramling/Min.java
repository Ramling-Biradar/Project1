package ramling;
import java.util.Scanner;
public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		int min=a[0];
		for(i=1;i<n;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
		

	}

}

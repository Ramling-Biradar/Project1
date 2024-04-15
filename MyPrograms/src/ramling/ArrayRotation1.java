package ramling;
import java.util.Scanner;
public class ArrayRotation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of an array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The original array is");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the number of rotations");
		int m=sc.nextInt();
		for(int i=0;i<m;i++)
		{
			int j,first;
			first=arr[0];
			for(j=0;j<n-1;j++)
			{
				arr[j]=arr[j+1];
				
			}
			arr[j]=first;
			
		}
		System.out.println("The array after the "+m+" Rotations is");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}

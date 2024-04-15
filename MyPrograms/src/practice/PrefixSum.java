package practice;
import java.util.Scanner;
public class PrefixSum {
	static void printarray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static void sumprefix(int arr[])
	{
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			arr[i]+=arr[i-1];
		}
	}

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The original array is :");
		printarray(a);
		System.out.println("Array after sorting");
		sumprefix(a);
		printarray(a);
		sc.close();
		
	}

}

package practice;
import java.util.*;
public class Reverse2DArray {
	static void printArray(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();	
		}
		System.out.println(arr.length);
	}
	static void ReverseArray(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr[i].length-1;j>=0;j--)
			{
				System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}	
	}

	public static void main(String[] args) {
		int r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		r=sc.nextInt();
		System.out.println("Enter the number of columns");
		c=sc.nextInt();
		System.out.println("Enter "+r*c+" Elements");
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			arr[i][j]=sc.nextInt();
			
			}
		}
		System.out.println("Our Array is :");
		printArray(arr);
		System.out.println("The Reversed Arreay is :");
		ReverseArray(arr);	
	}

}

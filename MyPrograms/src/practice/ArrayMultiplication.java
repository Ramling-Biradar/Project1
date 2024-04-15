package practice;
import java.util.Scanner;
public class ArrayMultiplication {
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
	}
	static void ArrayMul(int arr1[][],int r1,int c1,int arr2[][],int r2,int c2)
	{
		int mul[][]=new int[r1][c2];
		if(c1!=r2)
		{
			System.out.println("The Multiplication is not possible");
			return;
		}
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				for(int k=0;k<c1;k++)
				{
					mul[i][j]+=(arr1[i][k]*arr2[k][j]);
				}
			}
		}
		printArray(mul);
	
	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int r1,c1,r2,c2;
		System.out.println("Enter the rows in 1st matrix");
		r1=sc.nextInt();
		System.out.println("Enter the columns in 1st matrix");
		c1=sc.nextInt();
		System.out.println("Enter "+r1*c1+" Elements");
		int arr1[][]=new int[r1][c1];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the rows in 2nd matrix");
		r2=sc.nextInt();
		System.out.println("Enter the columns in 2nd matrix");
		c2=sc.nextInt();
		System.out.println("Enter "+r2*c2+" Elements");
		int arr2[][]=new int[r2][c2];
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The Multiplication of two matrixes is :");
		
		ArrayMul(arr1,r1,c1,arr2,r2,c2);
		
		
		
	}

}

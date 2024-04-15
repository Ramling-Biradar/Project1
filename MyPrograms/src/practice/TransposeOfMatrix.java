package practice;

import java.util.Scanner;

public class TransposeOfMatrix {
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
	static int[][] Transpose(int arr[][],int r,int c)
	{
		int trans[][]=new int[c][r];
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				trans[i][j]=arr[j][i];
			}
		}
		return trans;
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
		System.out.println("Our Original  Array is :");
		printArray(arr);
		System.out.println("The Transpose of a given matrix is :");
		int ans[][]=Transpose(arr,r,c);
		printArray(ans);
		
		
	

	}

}

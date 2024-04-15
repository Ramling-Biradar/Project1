package practice;

import java.util.Scanner;

public class EvenBeginning {
	static void swap(int arr[],int i,int j)
	{
		int temp;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	static void printarray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static void evensort(int arr[])
	{
		int n=arr.length;
		int left=0,right=n-1;
		while(left<right)
		{
			if(arr[left]%2==1&&arr[right]%2==0)
			{
				swap(arr,left,right);
				left++;
				right--;
			}
			if(arr[left]%2==0)
			{
				left++;
			}
			if(arr[right]%2==1)
			{
				right--;
			}
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
		evensort(a);
		printarray(a);
		sc.close();
		
	}

}

package practice;
//import java.util.Scanner;
public class BubbleSort {
	static void bubble(int arr[],int n)
	{
		int temp=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(arr[j-1]>arr[j])
				{
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[]= {-4,-7,88,21,5,7,-5};
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the length");
		int n=a.length;
		System.out.println("Array Before Sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		bubble(a,n);
		System.out.println("Array After Sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		

	}

}

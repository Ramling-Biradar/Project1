package practice;
import java.util.Scanner;
public class ZeroSort1 {
	static void swap(int arr[],int i,int j)
	{
		int temp;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void binarysort(int arr[])
	{
	  int n=arr.length;
	  int left=0;
	  int right=n-1;
	  while(left<right)
	  {
	
		  if(arr[left]==1&&arr[right]==0)
		  {
			 swap(arr,left,right);
			  left++;
			  right--;
		
	  }
		  if(arr[left]==0)
			  left++;
		  if(arr[right]==1)
			  right--;
	  }
	  for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
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
		//int a[]= {0,1,0,0,1,1,0,1,0,1,1,0,0};
		System.out.println("The original array is :");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Array after sorting");
		binarysort(a);
		
	}

}

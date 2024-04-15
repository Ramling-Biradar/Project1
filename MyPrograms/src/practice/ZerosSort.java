package practice;

public class ZerosSort {
	static void binarysort(int arr[])
	{
		int count=0;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
			{
				count++;	
			}
		}
		for(int i=0;i<n;i++)
		{
			if(i<count)
			{
				arr[i]=0;
			}
			else
			{
				arr[i]=1;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int a[]= {0,1,0,0,1,1,0,1,0,1,1,0,0};
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

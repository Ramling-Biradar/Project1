package a;
public class SelectionSort {
	static void selectionSort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			if(min!=i)
			{
				int temp;
				temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
				
				
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,4,10,8,3,1};
		System.out.println("Array Before Sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		selectionSort(a);
		System.out.println();
		System.out.println("Array after Sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		

	}

}

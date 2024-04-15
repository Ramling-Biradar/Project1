package ramu;

public class SelectionSort {
	static void selection(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int max=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[max])
				{
					max=j;
				}
				
			}
			if(max!=i)
			{
				int temp=arr[max];
				arr[max]=arr[i];
				arr[i]=temp;
				
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,6,2,99,10,-8};
		System.out.println("Array before sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		selection(arr);
		System.out.println();
		System.out.println("Array after sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		

	}

}

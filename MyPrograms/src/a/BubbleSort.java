package a;
public class BubbleSort {
	static void bubbleSort(int arr[])
	{
		int temp=0;
		int n=arr.length;
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
		// TODO Auto-generated method stub
		int arr[]={3,60,35,2,45,320,5};  
		System.out.println("Array before sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		bubbleSort(arr);
		System.out.println("Array after sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}




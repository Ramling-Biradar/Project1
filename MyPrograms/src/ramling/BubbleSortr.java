package ramling;

public class BubbleSortr {
	static void bubblesort(int arr[])
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
		int a[]= {1,8,2,3,4,7,11,9};
		System.out.println("Array before sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		bubblesort(a);
		System.out.println();
		System.out.println("Array after sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		
		

	}

}

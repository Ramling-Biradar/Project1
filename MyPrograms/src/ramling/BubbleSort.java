package ramling;

public class BubbleSort {
	static void Bubblesort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[index])
				{
					index=j;
				}
			}
			int small=arr[index];
			arr[index]=arr[i];
			arr[i]=small;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,1,6,3,-9,10,14};
		System.out.println("Array before sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Bubblesort(arr);
		System.out.println("Array after sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}

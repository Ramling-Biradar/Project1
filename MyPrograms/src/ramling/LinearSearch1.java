package ramling;

public class LinearSearch1 {
	public static int linear_search(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
				
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method
		int a[]= {10,20,30,40,50};
		int key=30;
		System.out.println("The element "+key+" found at index "+linear_search(a,key));
	}

}

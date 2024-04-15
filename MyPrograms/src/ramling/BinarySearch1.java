package ramling;

public class BinarySearch1 {
	public static void binarysearch(int arr[],int first,int last,int key)
	{
		int mid=(first+last)/2;
		while(first<=last)
		{
			if(arr[mid]<key)
			{
				first=mid+1;
			}
			else if(arr[mid]==key)
			{
				System.out.println("The element found in the list at"+mid+"position");
				break;
			}
			else
			{
				last=mid-1;
			}
		}
		if(first>last)
		{
			System.out.println("The element not found in the list at ");
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,4,7,9,23};
		int key=4;
		int last=arr.length-1;
		binarysearch(arr,0,last,key);
		

	}

}

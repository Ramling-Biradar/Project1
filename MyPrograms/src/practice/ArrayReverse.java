package practice;

public class ArrayReverse {
	static void rever(int arr[])
	{
		int n=arr.length;
		int left=0;
		int right=n-1;
		while(left<right)
		{
			int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			
		}
		for(int i=0;i<n;i++)
		{
		System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		rever(a);
		
	}

}

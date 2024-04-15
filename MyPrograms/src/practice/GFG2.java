package practice;

public class GFG2 {

	static void reverse(int a[])
	{
		int n=a.length;
		int left=0;
		int right=n-1;
		int temp;
		int res[]=new int[n];
		while(left<right)
		{
			temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			left++;
			right--;	
			
		}
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
		
	}
	public static void main(String []args)
	{
		int a[]= {1,2,3,4,5,6};
		reverse(a);
	}
}


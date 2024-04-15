package ramling;

public class Array3rdLargest {
	public static int Third(int a[],int total)
	{
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++ )
			{
				if(a[i]<a[j])
				{
					int temp=0;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		return a[2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,4,8,22,5,46};
		System.out.println("The third largest element is :"+Third(a,6));
		

	}

}

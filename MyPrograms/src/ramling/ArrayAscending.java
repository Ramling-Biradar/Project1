package ramling;

public class ArrayAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,2,1,7,8};
		System.out.println("The original Array is");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
						{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
						}
			}
		}
				System.out.println();
				System.out.println("Array after sorting");
				for(int i=0;i<a.length;i++)
				{
					System.out.print(a[i]+" ");
					
				}
				
				

	}

}

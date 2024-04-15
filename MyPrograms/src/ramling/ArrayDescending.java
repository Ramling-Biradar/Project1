package ramling;

public class ArrayDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,4,8,22,5,46};
		System.out.println("The original array is");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("The array in descending order");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		

	}

}

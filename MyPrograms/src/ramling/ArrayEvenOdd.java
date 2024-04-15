package ramling;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,8,7,6,4,3,55,64};
		System.out.println("Even numbers are");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Odd numbers are");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
				System.out.print(a[i]+" ");
		}
		
		

	}

}

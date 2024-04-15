package ramling;

public class ArrayLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,23,44,88,4,100,9,48,96};
		int large;
		large=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>large)
			{
				large=a[i];
			}
			
		}
		System.out.println("The largest elemrnt in the array is :"+large);
		

	}

}

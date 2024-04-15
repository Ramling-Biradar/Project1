package ramling;

public class Arrymin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,23,44,88,4,100,9,48,96};
		int min;
		min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			
		}
		System.out.println("The smallest elemrnt in the array is :"+min);
		

	}
}
package ramling;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		float sum=0,avg;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			
		}
		avg=sum/a.length;
		System.out.println("sum is"+sum);
		System.out.println("Average is:"+avg);
		

	}

}

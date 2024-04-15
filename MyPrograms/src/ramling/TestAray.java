package ramling;

public class TestAray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]=new int[5];
	int	a[]={10,20,30,40,50};
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
		
	}
	for(int i=0;i<a.length;i++)
	{
		sum+=a[i];
	}
		System.out.println("The sum is : "+sum);
		System.out.println("the average is :"+sum/a.length);
	
		

	}

}

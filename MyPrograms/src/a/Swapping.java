package a;

public class Swapping {
	static void swap(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a= "+a+"b= "+b);
		
		
		
	}
	



	public static void main(String[] args) {
		int a=13;
		int b=7;
		swap(a,b);

	}

}

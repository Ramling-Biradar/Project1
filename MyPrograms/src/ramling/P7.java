package ramling;

public class P7 {
	static int fact(int n)
	{
		if(n==0)
			return 1;
		else if(n==1)
			return 1;
		else 
			return n*fact(n-1);
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(0));
		System.out.println(fact(1));
		System.out.println(fact(2));
		System.out.println(fact(3));
		System.out.println(fact(4));
		System.out.println(fact(5));
		System.out.println(fact(6));
		System.out.println(fact(7));
		System.out.println(fact(8));
		System.out.println(fact(9));
		System.out.println(fact(10));
		
        
		
		
		
		

	}

}

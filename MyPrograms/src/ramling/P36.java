package ramling;

public  class P36 {
	static int gcd(int a,int b)
	{
		if(a==0)
			return b;
		else if(b==0)
			return a;
		else if(a>b)
			return gcd(a%b,b);
		else
			return gcd(a,b%a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		//P36 p=new P36();
		result=gcd(18,24);
		System.out.println(result);
		
		
		

	}

}

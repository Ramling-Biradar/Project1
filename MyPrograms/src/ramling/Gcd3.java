package ramling;
public class Gcd3 {
	 static int gcd(int b,int c)
	{
		if(b==0)
			return c;
		if(c==0)
			return b;
		else if(b>c)
			return gcd(b%c,c);
		else
			return gcd(b,c%b);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12,b=10,c=8;
		int res=gcd(a,gcd(b,c));
		System.out.println(res);
	}
}

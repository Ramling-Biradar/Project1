package ramling;
class qu{
static int b=2;
}
class ans extends qu
{
	static int b=20;
}

public class Practice18 {
	public static void main(String[] args)
	{
		int b=100;
		System.out.println(ans.b);
		System.out.println(b+qu.b);
		
	}

}

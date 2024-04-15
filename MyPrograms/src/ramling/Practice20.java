package ramling;
public class Practice20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=5/0;
			System.out.print("a ");
		}
		catch(ArithmeticException ae)
		{
			System.out.print("ArithmeticException ");
		}
		catch(Exception e)
		{
			System.out.print("Exception ");
		}
		System.out.println("Hello World");

	}

}

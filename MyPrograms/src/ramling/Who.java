package ramling;
class A1
{
	void callme()
	{
		System.out.println("i am A");
	}
}
class B extends A1
{
	void callme()
	{
		System.out.println("i am B");
	}
}
public class Who {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a=new B();
		a.callme();
		B b=new B();
		b.callme();

	}

}

package ramling;
//program to invoke current class method
class A
{
	void m()
	{
		System.out.println("i am m");
	}
	void n()
	{
		System.out.println("i am n");
		this.m();
	}
}
public class Demonstration_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.n();
		

	}

}

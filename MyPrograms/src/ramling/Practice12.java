package ramling;
abstract class Base
{
	abstract void fun();
}
class derived extends Base{
	void fun()
	{
		System.out.println("Ramling will Rule IT industry");
	}
}
public class Practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b=new derived();
		b.fun();

	}

}

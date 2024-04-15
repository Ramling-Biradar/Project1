package ramling;
class Animal3
{
	Animal3()
	{
		System.out.println("Animal is created");
	}
}
class Dog3 extends Animal3
{
	Dog3()
	{
		super();
		System.out.println("Dog is created");
	}
}
public class TestSuper3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog3 d=new Dog3();

	}

}

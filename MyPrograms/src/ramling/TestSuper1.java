package ramling;
class Animal
{
	String color="White";
}
class dog extends Animal
{
	String color="Black";
	void printcolor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class TestSuper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d=new dog();
		d.printcolor();

	}

}

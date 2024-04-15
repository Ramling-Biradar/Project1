package ramling;
abstract class car
{
	abstract void run();
}
class Hundayi extends car{
	void run()
	{
		System.out.println("Running Safely");
	}
	public static void main(String []args)
	{
		car c=new Hundayi();
		c.run();
	}



}

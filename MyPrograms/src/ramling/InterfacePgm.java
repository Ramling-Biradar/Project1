package ramling;
interface printable
{
	public void msg();
}
class pgm1 implements printable
{
	public void msg()
	{
		for(int i=0;i<10;i++)
		System.out.println("Hello....kutta");
	}
}
public class InterfacePgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printable obj=new pgm1();
		obj.msg();


	}

}

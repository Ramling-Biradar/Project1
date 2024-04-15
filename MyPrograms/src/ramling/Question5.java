package ramling;
class g
{
	 int i;
	int j;
	
}
class h extends g
{
	void display()
	{
		super.j=super.i+1;
		System.out.println(super.i+" "+super.j);
	}
}
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		h obj=new h();
		obj.i=2;
		obj.j=2;
		obj.display();

	}

}

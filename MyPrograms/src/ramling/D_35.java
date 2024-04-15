package ramling;
class point
{
	int x,y;
	void setpoint()
	{
		x=10;
		y=20;
	}
}
public class D_35{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point p=new point();
		p.setpoint();
		System.out.println("x: "+p.x);
		System.out.println("y: "+p.y);

	}

}

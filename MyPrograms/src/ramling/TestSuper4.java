package ramling;
class point2d
{
	double x,y;
	point2d() {    //default initialisation
	x=0.0;
	y=0.0;
	}
	point2d(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
}
class point3d extends point2d
{
	double z;
	point3d()
	{
		super();
		z=0.0;
	}
	point3d(double x,double y,double z)
	{
		super(x,y);
		this.z=z;
	}
}

public class TestSuper4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point3d d=new point3d();

	}

}

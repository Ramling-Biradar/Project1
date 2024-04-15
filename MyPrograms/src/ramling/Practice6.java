package ramling;
class circlepp
{
	double l,w;
	public circlepp(double l,double w)
	{
		this.l=l;
		this.w=w;
	}
	double Area()
	{
		return (l*w);
	}
	double Perimrter()
	{
		return 2*(l+w);
	}
	
}
class Rectangle extends circlepp
{
	double h;
	public Rectangle(double l,double w,double h)
	{
		super(l,w);
		this.h=h;
		
	}
	double volume() {
		return 2*(l*w+l*h+w*h);
		
	}
}

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circlepp p=new circlepp(10,20);
		Rectangle r=new Rectangle(10,20,30);
		p.Area();
		p.Perimrter();
		r.volume();
		System.out.println("Area of the cicle is :"+p.Area());
		System.out.println("Perimeter of the circle is :"+p.Perimrter());
		System.out.println("volume of the box is :"+r.volume());
		

	}

}

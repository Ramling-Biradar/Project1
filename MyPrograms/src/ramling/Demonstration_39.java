package ramling;
class circl
{
	double x,y;
	double r;
	circl(double a,double b,double c)
	{
		x=a;
		y=b;
		r=c;
	}
	circl(double c)
	{
		x=0;
		y=0;
		r=c;
	}
	circl(circl c)
	{
		x=c.x;
		y=c.y;
		r=c.r;
		
		
	}
	circl()
	{
		x=0.0;
		y=0.0;
		r=1.0;
		
	}
	double circumference()
	{
		return (2*Math.PI*r);
	}
	double area()
	{
		return (Math.PI*r*r);
	}
}
public class Demonstration_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circl c1=new circl(3.0,4.0,5.0);
		circl c2=new circl(5.0);
		circl c3=new circl(c1);
		circl c4=new circl();
		System.out.println("The area of circle c1 is:"+c1.area());
		System.out.println("The circumference of circle c1 is:"+c1.circumference());
		System.out.println("The area of circle c2 is:"+c2.area());
		System.out.println("The circumfernce of circle c2 is"+c2.circumference());
		System.out.println("The area of circle c3 is:"+c3.area());
		System.out.println("The circumfernce of circle c3 is:"+c3.circumference());
		System.out.println("The area of circle c4 is:"+c4.area());
		System.out.println("The circumfernce of circle c4 is:"+c4.circumference());

	}

}

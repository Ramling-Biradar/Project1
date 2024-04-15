package ramling;
class circle1{
	double x,y;
	double r;
	double circumference()
	{
		return 2*Math.PI*r;
	}
	double area()
	{
		return Math.PI*r*r;
	}
}
public class CircleDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle1 c1=new circle1();
		circle1 c2=new circle1();
		//creating multiple objects of a class
		c1.x=3.0;
		c1.y=4.0;
		c1.r=5.0;
		c2.x=-4.0;
		c2.y=-8.0;
		c2.r=10.0;
		System.out.println("area of circle c1:"+c1.area());
		System.out.println("area of circle c2:"+c2.area());
		System.out.println("circumference of circle c1 is:"+c1.circumference());
		System.out.println("circumfernce of circle c2 is:"+c2.circumference());
		
		

	}

}

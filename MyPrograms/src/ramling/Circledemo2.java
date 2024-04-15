package ramling;
class circle5
{
	double x,y;
	double r;
	double area()
	{
		return Math.PI*r*r;
	}
	circle5(double x,double y,double r)
	{
		this.x=x;
		this.y=y;
		this.r=r;
	}
}
public class Circledemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle5 c1=new circle5(3.0,4.0,5.0);
		circle5 c2=new circle5(-4.0,-8.0,10.0);
		System.out.println("the area of circle c1 is:"+c1.area());
		System.out.println("the area of circle c2 is:"+c2.area());
		

	}

}

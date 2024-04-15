package ramling;
interface Shape
{
    double  x=5; 
	void draw();
}
class Triangle  implements Shape{
	public void draw()
	{
		System.out.println("Draw traingle");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t=new Triangle();
		t.draw();
		System.out.println(Shape.x);

	}

}


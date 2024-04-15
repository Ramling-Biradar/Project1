package ramling;
class Student
{
	int rollno;
	String name,course;
	float fee;
Student(int rollno,String name,String course)
{
	this.rollno=rollno;
	this.name=name;
	this.course=course;
}
Student(int rollno,String name,String course,float fee)
{
	this(rollno,name,course);
	this.fee=fee;
}
void display() {
System.out.println(rollno+" "+name+" "+course+" "+fee);
}
	
}
public class Demonstration_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student(111,"ankit","java");
Student s2=new Student(112,"sumit","java",60000);
s1.display();
s2.display();
	}

}

package practice;
import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
	String operator;
	Scanner sc=new Scanner(System.in);
	Double num1,num2,result=0.0;
	System.out.println("Enter two numbers");
	num1=sc.nextDouble();
	num2=sc.nextDouble();
	System.out.println("Enter the operator");
	operator=sc.next();
	switch(operator)
	{
	case "+":result=num1+num2;
	break;
	case "-":result=num1-num2;
	break;
	case "*":result=num1*num2;
	break;
	case "/":result=num1/num2;
	break;
	default:System.out.println("ERROR n operation");
	break;
	}
	System.out.println("Result :"+result);

		sc.close();	

	}

}

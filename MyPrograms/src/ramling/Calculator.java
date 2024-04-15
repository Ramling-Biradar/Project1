package ramling;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1,num2,result=0;
		String operator;
		System.out.println("Program for the simple calculator");
		System.out.println("************************************");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of num1 and num2");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		System.out.println("Enter the operator");
		operator=sc.next();
		sc.close();
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
		default:System.out.println("Error in operation");
		break;
		
		}
		System.out.println(num1+" "+operator+" "+num2+" = "+result);

	}

}

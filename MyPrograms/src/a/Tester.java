package a;
class Stack
{
	private int top;
	private int maxsize;
	private int arr[];
	Stack(int maxsize)
	{
		this.top=-1;
		this.maxsize=maxsize;
		arr=new int[maxsize];
	}
	public boolean isFull()
	{
		if(top>=(maxsize-1))
		{
			return true;
		}
		return false;
	}
	public boolean push(int data)
	{
		if(isFull())
		{
			return false;
		}
		else
		{
			arr[++top]=data;
			return true;
		}
	}
	public void display()
	{
		if(top<0)
		{
			System.out.println("Stack is empty");
		}
		else
			
		{
			System.out.println("The elements of the stack are :");
			for(int i=top;i>=0;i--)
			{
				
				System.out.println(arr[i]+" ");
			}
		}
	}
	public int peek()
	{
		if(top<0)
			return Integer.MIN_VALUE;
		else
			return arr[top];
	}
	
}
public class Tester {

	public static void main(String[] args) {
		Stack stack=new Stack(5);
		if(stack.push(1))
			System.out.println("The element is pushed to stack");
		else
			System.out.println("Stack is full");
		if(stack.push(2))
			System.out.println("The element is pushed to stack");
		else
			System.out.println("Stack is full");
		if(stack.push(3))
			System.out.println("The element is pushed to stack");
		else
			System.out.println("Stack is full");
		if(stack.push(4))
			System.out.println("The element is pushed to stack");
		else
			System.out.println("Stack is full");
		if(stack.push(5))
			System.out.println("The element is pushed to stack");
		else
			System.out.println("Stack is full");
		stack.display();
		if(stack.push(6))
			System.out.println("The element is pushed to stack");
		else
			System.out.println("Stack is full");
		System.out.println("The top element is :"+stack.peek());
		
		
		
	
		
	}

}

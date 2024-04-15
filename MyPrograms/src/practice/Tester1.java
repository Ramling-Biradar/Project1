package practice;
class Queue
{
	private int front,rear,maxsize;
	private String arr[];
	Queue(int maxsize)
	{
		this.front=0;
		this.rear=-1;
		this.maxsize=maxsize;
		this.arr=new String[this.maxsize];
	}
	public boolean isFull()
	{
		if(this.rear==this.maxsize-1)
		{
			return true;
		}
		return false;
	}
	public boolean enqueue(String data)
	{
		if(isFull())
		{
			return false;
		}
		else
		{
			arr[++rear]=data;
			return true;
		}
	}
	public boolean isEmpty()
	{
		if(front>rear)
		{
			return true;
		}
		return false;
		
	}
	public void display()
	{
		for(int i=0;i<=rear;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public String dequeue()
	{
		if(isEmpty())
		{
			return "Empty";
		}
		else
		{
			String data=arr[this.front];
			arr[front++]=data;
			return data;
			
		}
	}
}
public class Tester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue=new Queue(5);
		System.out.println("Queue is created.\n");
		if(queue.enqueue("Ramling"))
			System.out.println("The element is enqueued into queue");
		else
			System.out.println("Queue is Full.\n");
		if(queue.enqueue("Raheem"))
			System.out.println("The element is enqueued into queue");
		else
			System.out.println("Queue is Full.\n");
		if(queue.enqueue("Raghavendra"))
			System.out.println("The element is enqueued into queue");
		else
			System.out.println("Queue is Full.\n");
		if(queue.enqueue("Ganesh"))
			System.out.println("The element is enqueued into queue");
		else
			System.out.println("Queue is Full.\n");
		if(queue.enqueue("Gundu"))
			System.out.println("The element is enqueued into queue");
		else
			System.out.println("Queue is Full.\n");
		System.out.println("The element of rhe queue are");
		System.out.println();
		queue.display();
		if(queue.enqueue("Vinay"))
			System.out.println("The element is enqueued into queue");
		else
			System.out.println("Queue is Full.\n");
		String dequeuedElement=queue.dequeue();
		if(dequeuedElement=="Empty")
			System.out.println("The Queue is Empty");
		else
			System.out.println("The Dequeued element is :"+dequeuedElement);
		dequeuedElement=queue.dequeue();
		if(dequeuedElement=="Empty")
			System.out.println("The Queue is Empty");
		else
			System.out.println("The Dequeued element is :"+dequeuedElement);
		dequeuedElement=queue.dequeue();
		if(dequeuedElement=="Empty")
			System.out.println("The Queue is Empty");
		else
			System.out.println("The Dequeued element is :"+dequeuedElement);
		
		dequeuedElement=queue.dequeue();
		if(dequeuedElement=="Empty")
			System.out.println("The Queue is Empty");
		else
			System.out.println("The Dequeued element is :"+dequeuedElement);
		dequeuedElement=queue.dequeue();
		if(dequeuedElement=="Empty")
			System.out.println("The Queue is Empty");
		else
			System.out.println("The Dequeued element is :"+dequeuedElement);
		dequeuedElement=queue.dequeue();
		if(dequeuedElement=="Empty")
			System.out.println("The Queue is Empty");
		else
			System.out.println("The Dequeued element is :"+dequeuedElement);
		dequeuedElement=queue.dequeue();
		
		
		
		
		
		
		
		

	}

}

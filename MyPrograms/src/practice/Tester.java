package practice;

class Node
{
	private String data;
	private Node next;
	public Node(String data)
	{
		this.data=data;
	}
	public void setData(String data)
	{
		this.data=data;
	}
	public void setNext(Node node)
	{
		this.next=node;
	}
	public String getData()
	{
		return this.data;
	}
	public Node getNext()
	{
		return this.next;
	}
}
class LinkedList
{
	private Node head;
	private Node tail;
	public Node getHead()
	{
		return this.head;
	}
	public Node getTail()
	{
		return this.tail;
	}
	public void addAtEnd(String data)
	{
		Node node = new Node(data);
		if(this.head==null)
		{
			this.head=this.tail=node;
		}
		else
		{
			this.tail.setNext(node);
			this.tail=node;
			
		}
	}
	public void addAtBeginning(String data)
	{
		Node node =new Node(data);
		if(this.head==null)
		{
			this.head=this.tail=node;
		}
		else
		{
			node.setNext(this.head);
			this.head=node;
		}
	}
	public void display()
	{
		Node temp=this.head;
		while(temp!=null)
		{
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
	}
	public Node find(String data)
	{
		Node temp=this.head;
		while(temp!=null)
		{
			if(temp.getData().equals(data))
			
				return temp;
			temp=temp.getNext();
			
		}
		return null;
	}
	
}
	public class Tester{
		public static void main(String []args)
		{
			LinkedList list=new LinkedList();
			list.addAtBeginning("Ramling");
			list.addAtEnd("Biradar");
			list.addAtBeginning("Jonnikeri");
			list.display();
			if(list.find("Ramling")!=null)
			{
				System.out.println("Node found");
			}
			else
			{
				System.out.println("Node not found");
			}
			
			
		}
	}

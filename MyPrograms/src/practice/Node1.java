package practice;

public class Node1 {
	private String data;
	private Node1 next;
	public Node1(String data){
		this.data=data;
	}
	public void setData(String data){
		this.data = data;
	}
	public void setNext(Node1 node){
		this.next = node;
	}
	public String getData(){
		return this.data;
	}
	public Node1 getNext(){
		return this.next;
	}
}

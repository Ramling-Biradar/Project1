package com.tns.Abstraction;

public class Demo {

	public  final static void  main(String[] args) {
		Shape sh;
		sh=new Rectangle(0.3f,0.5f);
		sh.calArea();
		sh.show();
		sh=new Square(0.5f);
		sh.calArea();
		sh.show();
		
		
	}

}

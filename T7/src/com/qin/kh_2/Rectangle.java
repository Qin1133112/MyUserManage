package com.qin.kh_2;

public class Rectangle extends Shape {
	private double area;
	private double per;
	private String corlor;
	private double width;
	private double height;
	
	double getArea() {
		return area=width*height;
		//System.out.println("�����������"+area);

	}


	double getPer() {
		return per=2*(width+height);
		//System.out.println("�����������"+per);

	}


	void showAll() {

		System.out.println("�����εĸߣ�"+this.height+"cm");
		System.out.println("�����εĿ�"+this.width+"cm");
		System.out.println("�����ε������"+this.getArea()+"cm2");
		System.out.println("�����ε��ܳ���"+this.getPer()+"cm");
		System.out.println("�����ε���ɫ��"+this.corlor);
	}
	Rectangle(){
		
	}
	Rectangle(double width,double height,String corlor){
		this.width=width;
		this.height=height;
		this.corlor=corlor;
	}

}

package com.qin.kh_2;

public class Circle extends Shape {
	private double radius;
	private String corlor;
	double getArea() {

		return 3.14*radius*radius;
	}

	double getPer() {
		return 3.14*2*radius;
	}
	void showAll() {
		System.out.println("Բ�εİ뾶��"+this.radius+"cm");
		System.out.println("Բ�ε������"+this.getArea()+"cm2");
		System.out.println("Բ�ε��ܳ���"+this.getPer()+"cm");
		System.out.println("Բ�ε���ɫ��"+this.corlor);
	}
	Circle(){
		
	}
	Circle(double radius,String corlor){
		this.radius=radius;
		this.corlor=corlor;
	}
}

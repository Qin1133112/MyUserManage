package com.qin.XT7;

public class Car extends Vehicle {
	private String brand;
	private String corlor;
	private double speed;
	private int n;
	public Car(){}
	public Car(String brand,String corlor,double speed,int n){
		//super(brand,corlor, speed);
		this.brand=brand;
		this.corlor=corlor;
		this.speed=speed;
		this.n=n;
	}
	
	public int loader(int n){
		return n;
	}
	public void run(){
		System.out.println(this.corlor+"��"+this.brand+"�ٶ�Ϊ��"+this.speed+"Km/s  ������Ϊ��"+n);
	}
}

package com.qin.XT1;

public class Point {
	private int x;
	private int y;
	
	public Point(){
		System.out.println("������Ϊ��"+this.x);
		System.out.println("������Ϊ��"+this.y);
	}
	
	public Point(int x0,int y0){
		this.x=x0;
		this.y=y0;
		System.out.println("������Ϊ��"+this.x);
		System.out.println("������Ϊ��"+this.y);
	}
	
	public void movePoint(int dx,int dy){
		this.x=this.x-dx;
		this.y=this.y-dx;
		System.out.println("������Ϊ��"+this.x);
		System.out.println("������Ϊ��"+this.y);
	}
}

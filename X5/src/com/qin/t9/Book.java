package com.qin.t9;

public class Book {
	private String bookName;
	private static int bno=0;
	private float price;
	private static int bnum=0;
	private static int count=0;
	public Book(){
		
	}
	public Book(String bookName,float price){
		this.bookName=bookName;
		this.price=price;
		bno ++;
		//bnum++;
	}
	public void show(){
		System.out.println("��"+bnum+"�����������"+this.bookName+ "  �۸�Ϊ��"+this.price+"Ԫ          ���Ϊ��"+this.bno);
	}
	public void getBnum(){
		bnum++;
		System.out.println("����Ϊ��"+bnum);
	}
	public void sum(Book[] book){
		for(int i=0;i<book.length;i++){
			//bnum++;
			count++;
			//System.out.println("�ܲ���Ϊ��"+count);
		}
		System.out.println("�ܲ���Ϊ��"+count);
	}
	
}

package com.qin.t7;

public class Employee {
	private String eno;
	private String name;
	private int sal;
	private String dept;
	
	public Employee(String eno){
		this.eno=eno;
	}
	public Employee(String eno,String name){
		this.eno=eno;
		this.name=name;
	}
	public Employee(String eno,String name,int sal,String dept){
		this.eno=eno;
		this.name=name;
		this.sal=sal;
		this.dept=dept;
	}
	public Employee(){
		
	}
	public void showInfomation(){
		System.out.println("Ա����"+eno+"  ������"+name+"  нˮ��"+sal+"  ���ţ�"+dept);
	}
}

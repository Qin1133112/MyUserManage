package com.qin.t7;

public class Test {

	public static void main(String[] args) {
		System.out.println("*************************************************************");
		Employee e1=new Employee();
		e1.showInfomation();
		System.out.println("*************************************************************");
		Employee e2=new Employee("1122");
		e2.showInfomation();
		System.out.println("*************************************************************");
		Employee e3=new Employee("4455","����");
		e3.showInfomation();
		System.out.println("*************************************************************");
		Employee e4=new Employee("7788","�ŷ�",10000,"����");
		e4.showInfomation();
	}

}

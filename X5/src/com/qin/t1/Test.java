package com.qin.t1;

public class Test {

	public static void main(String[] args) {
		Address a=new Address();
		a.setCountry("�й�");
		a.setProvice("����ʡ");
		a.setCity("������");
		a.setStress("�����");
		a.setPostNo("003004");
		a.showInfo();
		System.out.println("********************************************************");
		Address a1=new Address("�й�","�ӱ�ʡ","�ػʵ���","������","066004");
		a1.showInfo();

	}

}

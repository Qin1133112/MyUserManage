package com.qin.t2;

public class Test {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEno("1001");
		e.setName("�滨");
		e.setSal(1000f);
		e.setPer(0.15f);
		float k=e.incre();
		float j=e.sum();
		System.out.println("нˮ�����"+k);
		System.out.println("���������ܶ"+j);

	}

}

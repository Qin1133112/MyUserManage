package com.qin.XT3;

public class Computer {
	private char corlor;
	private int cpu;
	public Computer(){
		System.out.println("�����޲����Ĺ��췽��");
	}
	public Computer(char corlor,int cpu){
		this.corlor=corlor;
		this.cpu=cpu;
		System.out.println("�����в����Ĺ��췽��");
	}
	
	public void showInfomation(){
		System.out.println("�ñʼǱ�����ɫΪ��"+corlor);
		System.out.println("�ñʼǱ���cpuΪ��"+cpu);
	}
}

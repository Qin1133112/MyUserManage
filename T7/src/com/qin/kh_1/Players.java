package com.qin.kh_1;

public class Players {
	private static int sum=0;
	private Players(){}
	public static Players create(){
		if(sum<11){
			sum++;
			System.out.println("������"+sum+"������");	
		}
		else{
			System.out.println("�Բ����Ѿ�������11�������ˣ������ٴ�����");
		}
		return new Players();
		
		
	}
}

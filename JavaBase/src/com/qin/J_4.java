package com.qin;

import java.util.Scanner;

public class J_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("����һ��������");
		int n=sc.nextInt();
		int i=n/10;
		if(n<100&&n>=0){
			switch(i){
			case 10:
			case  9:
					System.out.println("�ȼ�A");
					break;
			case  8:
				System.out.println("�ȼ�B");
				break;
			case  7:
				System.out.println("�ȼ�C");
				break;
			case  6:
				System.out.println("�ȼ�D");
				break;
			default :
				System.out.println("�ȼ�E");
					
			}
		}else{
			System.out.println("�����˴���ķ���");
		}
		
	}

}

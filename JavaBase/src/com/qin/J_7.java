package com.qin;

import java.util.Scanner;

public class J_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun();
	}
	static void fun(){
		Scanner sc=new Scanner(System.in);
		int n=0;
		while(n<7){
			System.out.println("�������֣�");
			int c=sc.nextInt();
			switch(c){
			case 1:
				System.out.println("������");
				break;
			case 2:
				System.out.println("����һ");
				break;
			case 3:
				System.out.println("���ڶ�");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("������");
				break;
			case 7:
				System.out.println("������");
				break;
			}
			n++;
		}
	}
}

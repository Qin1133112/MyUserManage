package com.qin;

import java.util.Scanner;

public class J_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("����һ�����֣�");
		int n=sc.nextInt();
		if(n%3==0&&n%5==0){
			System.out.println("��ͬʱ��3��5����");
		}
		else{
			System.out.println("����ͬʱ��3��5����");
		}
	}

}

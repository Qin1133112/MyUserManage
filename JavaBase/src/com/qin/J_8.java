package com.qin;

import java.util.Scanner;

public class J_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("�����������֣�");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		max(a,b,c);
	}
	static int  max(int a,int b,int c){
		int max=0;
		max=a>b?a:b;
		max=max>c?max:c;
		System.out.println("���ֵΪ��"+max);
		return max;
	}
	
}

package com.qin;

import java.util.Scanner;

public class T_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����һ�����֣�");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		huiwen(n);
	}
	static void huiwen(int s){
		StringBuffer sb=new StringBuffer(s);
		StringBuffer s1=sb.reverse();
		if(sb.equals(s1)){
			System.out.println(s+"�ǻ�����");
		}else{
			System.out.println(s+"���ǻ�����");
		}
	}
}

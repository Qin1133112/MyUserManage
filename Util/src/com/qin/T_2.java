package com.qin;

import java.util.Scanner;

public class T_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("�����ַ�����");
		String s=sc.nextLine();
		int count=0;
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++){
			if(c[i]=='e'){
				count++;
			}
		}
		System.out.println("e���ֵĴ�����"+count);
	}

}

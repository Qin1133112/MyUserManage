package com.qin;

import java.util.Arrays;
import java.util.Scanner;

public class J_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("�������鳤�ȣ�");
		int n=sc.nextInt();
		String[] s=new String[n];
		
		for(int i=0;i<s.length;i++){
			System.out.println("�����"+(i+1)+"�ַ�����");
			s[i]=sc.next();
		}
		//System.out.print(Arrays.toString(s));
		System.out.println("����һ���ַ�����");
		String a=sc.next();
		int count=0;
		for(int i=0;i<s.length;i++){
		
			if(a.equals(s[i])){
				count++;
			}
		}
		if(count>0){
			count++;
			System.out.println("Yes");
		}
		else{
			System.out.println("NO");
		}
	}

}

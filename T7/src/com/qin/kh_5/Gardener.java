package com.qin.kh_5;

import java.util.Scanner;

public class Gardener {
	public Fruit create(){
		Fruit f=null;
		Scanner sc=new Scanner(System.in);
		String c=sc.next();
		
			if(c.equals("ƻ��")){
				f=new Apple();
				//flag=false;
			}
			else if(c.equals("�㽶")){
				f=new Banana();
			}
			else if(c.equals("����")){
				f=new Oranges();
			}
			else if(c.equals("����")){
				f=new Pear();
			}else{
				System.out.println("����Ķ��󲻴���");
			}
		return f;
	}
}

package com.qin;

public class System1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.getSecurityManager()+"  "+System.nanoTime()+"  ");
		System.getSecurityManager();
		System.runFinalization();
	}

}

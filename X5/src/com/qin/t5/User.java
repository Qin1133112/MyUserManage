package com.qin.t5;

public class User {
	private String userName;
	private String password;
	private int count=0;//��¼�û�����
	public User(){
		
	}
	public User(String userName){
		this.userName=userName;
	}
	public User(String userName,String password){
		this.userName=userName;
		this.password=password;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(){
		this.password=password;
	}
	
	public void show(){
		
			count++;
		System.out.println("�û�����"+userName);
		System.out.println("���룺"+password);
		System.out.println("�û�����"+count+"��");
	}
}

package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import pojo.User;
import utils.ConnUtil;
import action.Action;

public class UserManageSystem {
	static Scanner sc=new Scanner(System.in);
	static Action action=new Action();
	static User u=new User();
	public static ConnUtil connUtil=new ConnUtil();
	public static Connection conn;

	public static void main(String[] args) {
		
		//action.register();
		//action.selectById();
		//action.selectAll();
//		boolean c=action.login();
//		System.out.println(c);
		
		index();
		
		
	}

	public static void index() {
		
		System.out.println("=======��ӭʹ���û�����ϵͳ=======");
		System.out.println("����������ѡ�����¹��ܣ�");
		System.out.println("1:ע���û�");
		System.out.println("2.�û���¼");
		int i=sc.nextInt();
		switch(i){
			case 1: action.register();
				break;
			case 2: action.login(u);
				break;
		}
		if(action.login(u)){
			System.out.println("��¼�ɹ�");
			
			String sql="select rolename from u_role where userid=?";
			try {
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setInt(1, u.getUserId());
				ps.executeQuery();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			System.out.println("��ѡ�����¹���");
		}
	}

	
}

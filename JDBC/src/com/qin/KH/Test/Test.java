package com.qin.KH.Test;

import com.qin.KH.dao.UserDao;
import com.qin.KH.service.UserService;

public class Test {
	
	/**
	 * ����JDBC 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//UserService userService=new UserService();
		//userService.createTable();
		String sql="if "
				+ "create table user2(Name varchar(10) primary key,"
				+ "Pwd varchar(6) not null,"
				+ "Email varchar(64),Birthday DATE)";
		UserDao userDao=new UserDao();
		userDao.createTable(sql);
		System.out.println("����ɹ�");
		/*String sql1="insert into user values('����','888888','zhangsan@126.com',to_date('1986-10-11','YYYY-MM-DD'))";
		String sql2="insert into user values('����','999999','lisi@126.com',to_date('1988-10-23','YYYY-MM-DD'))";
		String sql3="insert into user values('����','777777','wangwu@126.com',to_date('1990-9-11','YYYY-MM-DD'))";
		userDao.inser(sql1);
		System.out.println("�����������ݿ�ɹ�");
		userDao.inser(sql2);
		System.out.println("���Ĳ������ݿ�ɹ�");
		userDao.inser(sql3);
		System.out.println("����������ݿ�ɹ�");
		String sql4="update user1 set birthday=sysdate where name='����'";	
		userDao.update(sql4);
		System.out.println("����������Ϣ�ɹ�");*/
//		String sql5="delete from user1 where name in('����','����','����')";
//		userDao.delete(sql5);
//		System.out.println("ɾ��������Ϣ�ɹ�");
	}

}

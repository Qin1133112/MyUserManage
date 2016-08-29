package com.qin.KH.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.qin.KH.util.ConnUtil;

/**
 * UserDao��
 * ���ݿ���ɾ�Ĳ�ķ���
 * @author Admin
 *
 */

public class UserDao {
	
	
	Connection conn=ConnUtil.getInstance();
	Statement st=null;
	ResultSet rs;
	
	/**
	 * �������ݿ��
	 * @param sql
	 */
	public void createTable(String sql){
		
		
		try {
			st=conn.createStatement();
			st.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("����ʧ��");
			e.printStackTrace();
		}
		
	}
	/**
	 * �������ݿ�
	 * @param sql
	 */
	public void inser(String sql){
		try {
			st=conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * �������ݿ�
	 * @param sql
	 */
	public void update(String sql){
		try {
			st=conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * ɾ�����ݿ�
	 * @param sql
	 */
	public void delete(String sql){
		try {
			st=conn.createStatement();
			st.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("���ݿ�ɾ��ʧ��");
			e.printStackTrace();
		}
		
	}
	
	
	
}

package com.qin.KH.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ���ݿ����ӹ�����
 * @author Admin
 *
 */

public class ConnUtil {
	
	private Connection conn;
	
	private Connection getConn() {
		return conn;
	}
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	/**
	 * ��װ���ݿ�����
	 * @return conn
	 */
	private static Connection conn(){
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@127.0.0.1:1521:qin";
			String user="scott";
			String password="tiger";
			conn=DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("���Ӵ���");
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * ��ȡ���ݿ����Ӷ���
	 * @return conn
	 */
	public static Connection getInstance(){
		Connection conn=ConnUtil.conn();
		return conn;
	}
}

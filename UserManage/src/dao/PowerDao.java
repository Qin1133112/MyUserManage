package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import pojo.Power;
import utils.ConnUtil;
import utils.Max_Id;

/**
 * Ȩ�޹���
 * @author QinGuangrui
 *
 */

public class PowerDao {
	public ConnUtil connUtil=new ConnUtil();
	public Connection conn;
	Max_Id mx=new Max_Id();
	Scanner sc=new Scanner(System.in);
	/**
	 * �����û�Ȩ��
	 * @param u
	 * @return flag
	 */
	
	public boolean addPow(Power p){
		boolean flag=false;
		conn=connUtil.getConn();
			String sql="insert into pow values(?,?,?)";
			try {
				int n=mx.select_maxPowId();
				int i=mx.select_maxUserId();
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setInt(1, n+1);
				ps.setString(3, p.getPow());
				ps.setInt(2, i);
				ps.execute();
				flag=true;
			} catch (SQLException e) {
				
				e.printStackTrace();
			}

		return flag;
	}
	/**
	 * ɾ���û�Ȩ��
	 * @param id
	 * @throws SQLException
	 */
	public void deletePow(int id) throws SQLException {
		conn=connUtil.getConn();
		String sql="delete from pow where userid=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1,id);
		ps.executeUpdate();
	}
	/**
	 * �����û�id�����û�Ȩ��
	 * @param id
	 * @throws SQLException
	 */
	public void updatePow(int id) throws SQLException {
		conn=connUtil.getConn();
		String sql="update pow set pow=? where userid=?";
		System.out.println("�޸��û�Ȩ��Ϊ1��2��");
		String pow=sc.next();
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, pow);
		ps.setInt(2, id);
		ps.execute();
	}
}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import pojo.User;
import utils.CheckUtils;
import utils.ConnUtil;
import utils.Max_Id;

public class UserDao {
	
	public ConnUtil connUtil=new ConnUtil();
	public Connection conn;
	Scanner sc=new Scanner(System.in);
	Max_Id mx=new Max_Id();
	CheckUtils check=new CheckUtils();
	
	/**
	 * �û���ѯ������Ϣ
	 * @param u
	 * @return
	 */
	public boolean selectInfo(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String userName=u.getUserName();
		String sql="select userid,username,pwd,email from userinfo where userName=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, userName);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("�û�id:"+rs.getInt("userid"));
				System.out.println("�û���:"+rs.getString("username"));
				System.out.println("�û�����:"+rs.getString("pwd"));
				System.out.println("�û�����:"+rs.getString("email"));
				System.out.println("***********************************");
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	/**
	 * ������ͨ�û�
	 * @param u
	 * @return flag
	 */
	
	public boolean addUser(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		try {
			int n = mx.select_maxUserId();
			String sql="insert into userInfo values(?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, n+1);
			ps.setString(2, u.getUserName());
			ps.setString(3, u.getPwd());
			ps.setString(4, u.getEmail());
			ps.execute();
			conn.commit();
			flag=true;	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	/**
	 * ����Ա�����û�ID��ѯ�û���Ϣ
	 * @param u
	 * @return
	 */
	public boolean selectUserById(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String sql="select userid,username,pwd,email from userinfo where userid=? ";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, u.getUserId());
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("�û�id:"+rs.getInt("userid"));
				System.out.println("�û���:"+rs.getString("username"));
				System.out.println("�û�����:"+rs.getString("pwd"));
				System.out.println("�û�����:"+rs.getString("email"));
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	/**
	 * ����Ա�����û�IDģ����ѯ�û���Ϣ
	 * @param u
	 * @return
	 */
	public boolean selectUserByIds(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String sql="select userid,username,pwd,email from userinfo where userid like '%?%'";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, u.getUserId());
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("�û�id:"+rs.getInt("userid"));
				System.out.println("�û���:"+rs.getString("username"));
				System.out.println("�û�����:"+rs.getString("pwd"));
				System.out.println("�û�����:"+rs.getString("email"));
				System.out.println("************************");
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			System.out.println("��ѯ����");
			e.printStackTrace();
		}
		return flag;
	}
	/**
	 * ����Ա�����û�����ѯ�û���Ϣ
	 * @param u
	 * @return
	 */
	public boolean selectUserByName(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String sql="select userid,username,pwd,email from userinfo where userName=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, u.getUserName());
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("�û�id:"+rs.getInt("userid"));
				System.out.println("�û���:"+rs.getString("username"));
				System.out.println("�û�����:"+rs.getString("pwd"));
				System.out.println("�û�����:"+rs.getString("email"));
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	/**
	 * ����Ա�����û���ģ����ѯ�û���Ϣ
	 * @param u
	 * @return
	 */
	public boolean selectUserByNames(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String sql="select userid,username,pwd,email from userinfo where userName like '%?%'";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, u.getUserName());
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("�û�id:"+rs.getInt("userid"));
				System.out.println("�û���:"+rs.getString("username"));
				System.out.println("�û�����:"+rs.getString("pwd"));
				System.out.println("�û�����:"+rs.getString("email"));
				System.out.println("************************");
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	/**
	 * ����Ա��ѯȫ���û���Ϣ
	 * @param u
	 * @return 
	 */
	public boolean selectUserAll(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String sql="select userid,username,pwd,email from userinfo";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("�û�id:"+rs.getInt("userid"));
				System.out.println("�û���:"+rs.getString("username"));
				System.out.println("�û�����:"+rs.getString("pwd"));
				System.out.println("�û�����:"+rs.getString("email"));
				System.out.println("************************************");
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	/**
	 * ��ͨ�û������Լ�����Ϣ
	 * @param u
	 * @return
	 */
	public boolean updateByUser(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String user=u.getUserName();
		System.out.println(user);
		System.out.println("������ĵ��û�����");
		String userName=sc.next();
		System.out.println("���������룺");
		String pwd=sc.next();
		System.out.println("����ȷ�����룺");
		String pwd1=sc.next();
		
		String sql="update userinfo set username=?,pwd=?,email=? where username=user";
		if(pwd.equals(pwd1)){
			System.out.println("���������ַ��");
			String email=sc.next();
			if(check.checkEmail(email)){
				try {
					PreparedStatement ps=conn.prepareStatement(sql);
					ps.setString(1, userName);
					ps.setString(2, pwd);
					ps.setString(3, email);
					ps.execute();
					conn.commit();
					System.out.println("�޸ĳɹ�");
					flag=true;
				} catch (SQLException e) {
					System.out.println("���´���");
					e.printStackTrace();
				}
			}
			
		}else{
			System.out.println("�����������벻��ȷ�������²�����");
		}
		return flag;
	}
	/**
	 * ����Ա�����û�id���û����и���
	 * @param u
	 * @return
	 */
	public boolean updateById(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		System.out.println("����Ҫ�޸ĵ��û�ID��");
		int id=sc.nextInt();
//		String sql="select userid from userinfo";
//		try {
//			PreparedStatement ps=conn.prepareStatement(sql);
//			ResultSet rs=ps.executeQuery();
//			while(rs.next()){
//				if(rs.getInt("userid").equals(id)){
//					
//					//System.out.println("��֤ͨ��");
//				}
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("������ĵ��û�����");
		String userName=sc.next();
		System.out.println("���������룺");
		String pwd=sc.next();
		System.out.println("����ȷ�����룺");
		String pwd1=sc.next();
		
		String sql1="update userinfo set username=?,pwd=?,email=? where userid=?";
		if(pwd.equals(pwd1)){
			System.out.println("���������ַ��");
			String email=sc.next();
			if(check.checkEmail(email)){
				try {
					PreparedStatement ps=conn.prepareStatement(sql1);
					ps.setString(1, userName);
					ps.setString(2, pwd);
					ps.setString(3, email);
					ps.setInt(4, id);
					ps.execute();
					conn.commit();
					System.out.println("�޸ĳɹ�");
					flag=true;
				} catch (SQLException e) {
					System.out.println("���´���");
					e.printStackTrace();
				}
			}
			
		}else{
			System.out.println("�����������벻��ȷ�������²�����");
		}
		return flag;
	}

}

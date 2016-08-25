package action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import pojo.User;
import utils.ConnUtil;

/**
 * �û���¼��
 * @author QinGuangrui
 *
 */

public class LoginAction {
	Scanner sc=new Scanner(System.in);
	ConnUtil connUtil=new ConnUtil();
	Connection conn=connUtil.getConn();
	/**
	 * �û���¼
	 * @param u
	 * @return �û�id��
	 */
	public int login(User u){
		int userId=0;
		System.out.println("�����û�����");
		String userName=sc.next();
		u.setUserName(userName);
		System.out.println("�������룺");
		String pwd=sc.next();
		u.setPwd(pwd);
		String sql="select userid,username,pwd from userinfo";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				if(rs.getString("username").equals(u.getUserName()) && rs.getString("pwd").equals(u.getPwd())){
					userId=rs.getInt("userid");
					//System.out.println("��֤ͨ��");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userId;
	}
	
}

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
	RegisteAction ra=new RegisteAction();
	IndexAction ia=new IndexAction();
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
		String sql="select userid,username,pwd from userinfo where username=? and pwd=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, pwd);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				userId=rs.getInt("userid");
		}else{
			System.out.println("���û�������!����ע������˳���");
			System.out.println("1.ע��");
			System.out.println("2.������һ��");
			String n=sc.next();
			switch(n){
				case "1":
					ra.register();
					break;
				case "2":
					ia.index();
					break;
				default:
					System.exit(0);
					break;
			}
			
		}
		} catch (SQLException e) {
			//login(u);
			//e.printStackTrace();
		}
		return userId;
	}
	
}

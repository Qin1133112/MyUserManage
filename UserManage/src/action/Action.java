package action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import pojo.Power;
import pojo.Role;
import pojo.User;
import service.PowService;
import service.RoleService;
import service.UserService;
import utils.CheckUtils;
import utils.ConnUtil;

public class Action {
	
	Scanner sc=new Scanner(System.in);
	ConnUtil connUtil=new ConnUtil();
	Connection conn=connUtil.getConn();
	/**
	 * �û���¼
	 */
	public boolean login(User u){
		boolean flag=false;
		System.out.println("�����û�����");
		String userName=sc.next();
		u.setUserName(userName);
		System.out.println("�������룺");
		String pwd=sc.next();
		u.setPwd(pwd);
		String sql="select username,pwd from userinfo";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				if(rs.getString("username").equals(u.getUserName()) && rs.getString("pwd").equals(u.getPwd())){
					flag=true;
					//System.out.println("��֤ͨ��");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	/**
	 * �û���Ϣע��
	 */
	public void register() {
		
		User u=new User();
		CheckUtils check=new CheckUtils();
		
			
		System.out.println("�����û�����");
		String userName=sc.next();
		System.out.println("�������룺");
		String pwd=sc.next();
		System.out.println("���������ַ��");
		String email=sc.next();
		u.setUserName(userName);
		u.setPwd(pwd);
		u.setEmail(email);
		check.checkUser(u);
		UserService us=new UserService();
		us.addUser(u);
		System.out.println("�û�������");

		Role r=new Role();
		System.out.println("�������û��Ľ�ɫ:admin ���� user��");
		String role=sc.next();
		r.setRoleName(role);
		String i=check.checkRole(r);
		RoleService rs=new RoleService();
		rs.addRole(r);
		System.out.println("��ɫ�������");
		
		Power p=new Power();
		p.setPow(i);
		PowService ps=new PowService();
		ps.addPow(p);
		System.out.println("����Ȩ�޳ɹ�");
	}
	/**
	 * ���selectId�������������ٴ�����
	 */
	public void selectId() {
		User u=new User();
		int userid=sc.nextInt();
		u.setUserId(userid);
		UserService us=new UserService();
		us.selectUserById(u);
	}
	/**
	 * ͨ��ID�Ų�ѯ
	 */
	public void selectById(){
		System.out.println("�����û�id�ţ�");
		selectId();
	}
	
	/**
	 * ͨ��ID��ģ����ѯ
	 */
	public void selectByIds(){
		System.out.println("����id����ֶΣ�");
		selectId();
	}
	/**
	 * ���selectName�������������ٴ�����
	 */
	public void selectName() {
		User u=new User();
		String userName=sc.next();
		u.setUserName(userName);
		UserService us=new UserService();
		us.selectUserById(u);
	}
	/**
	 * ͨ���û�����ѯ
	 */
	public void selectByUserName(){
		System.out.println("�����û�����");
		selectName();
	}
	
	/**
	 * ͨ���û���ģ����ѯ
	 */
	public void selectByUserNames(){
		System.out.println("�����û�������ֶΣ�");
		selectName();
	}
	/**
	 * ��ѯ�û���������Ϣ
	 */
	public void selectAll(){
		User u=new User();
		UserService us=new UserService();
		us.selectUserAll(u);
	}

}

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
	
	/**
	 * �û���Ϣע��
	 */
	public void register() {
		
		User u=new User();
		CheckUtils check=new CheckUtils();
		/**
		 * ע���û��������롢����
		 */
		System.out.println("�����û�����");
		String userName=sc.next();
		System.out.println("�������룺");
		String pwd=sc.next();
		System.out.println("����ȷ�����룺");
		String pwd1=sc.next();
		if(pwd.equals(pwd1)){
			System.out.println("���������ַ��");
			String email=sc.next();
			u.setUserName(userName);
			u.setPwd(pwd);
			u.setEmail(email);
			check.checkUser(u);
			UserService us=new UserService();
			us.addUser(u);
			//System.out.println("�û�������");
			// ע���û���ɫ
			String i = register_role(check);
			//�����û���˵�޸�Ȩ�ޱ�
			registe_Power(i);
		}else{
			System.out.println("�������벻һ��");
		}
	}

	/**
	 * �����û���˵�޸�Ȩ�ޱ�
	 * @param i
	 */
	public void registe_Power(String i) {
		Power p=new Power();
		p.setPow(i);
		PowService ps=new PowService();
		ps.addPow(p);
		//System.out.println("����Ȩ�޳ɹ�");
	}

	/**
	 * ע���û���ɫ
	 * @param check
	 * @return
	 */
	public String register_role(CheckUtils check) {
		Role r=new Role();
		System.out.println("�������û��Ľ�ɫ:admin ���� user��");
		String role=sc.next();
		r.setRoleName(role);
		String i=check.checkRole(r);
		RoleService rs=new RoleService();
		rs.addRole(r);
		//System.out.println("��ɫ�������");
		return i;
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

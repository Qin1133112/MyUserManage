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

/**
 * �û�ע����
 * @author QinGuangrui
 *
 */

public class RegisteAction {
	
	Scanner sc=new Scanner(System.in);
	ConnUtil connUtil=new ConnUtil();
	Connection conn=connUtil.getConn();
	/**
	 * ����Ա���û���Ϣע��
	 */
	public void register() {
		
		User u=new User();
		CheckUtils check=new CheckUtils();
		/**
		 * ע���û��������롢����
		 */
		System.out.println("�����û�����");
		String userName=sc.next();
		String sql="select username from userinfo";
		boolean b=true;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){												//�ж��û����Ƿ����
				if(rs.getString("username").equals(userName)){
					b=false;
				}
			}
			//���û���������������ز���
			if(!b){
				System.out.println("�û����Դ��ڣ�������ע�ᣡ");
				register();
			}else{
				System.out.println("�������룺");
				String pwd=sc.next();
				System.out.println("����ȷ�����룺");
				String pwd1=sc.next();
				//�������һ��
				if(pwd.equals(pwd1)){
					System.out.println("���������ַ��");
					String email=sc.next();
					u.setUserName(userName);
					u.setPwd(pwd);
					u.setEmail(email);
					//���û����������Ƿ�Ϊ�պ������ʽ�Ƿ���ȷ�����жϣ���������ز���
					if(check.checkUser(u)){
						UserService us=new UserService();
						us.addUser(u);
						//System.out.println("�û�������");
						// ע���û���ɫ
						String i = register_role(check);
						//�����û���˵�޸�Ȩ�ޱ�
						registe_Power(i);
					}else{
						register();
					}
					
				}else{
					System.out.println("�������벻һ��,������ע��");
					register();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	/**
	 * ��ͨ�û���Ϣע��
	 */
	public void userRegister() {
		
		User u=new User();
		CheckUtils check=new CheckUtils();
		/**
		 * ע���û��������롢����
		 */
		System.out.println("�����û�����");
		String userName=sc.next();
		String sql="select username from userinfo";
		boolean b=true;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){												//�ж��û����Ƿ����
				if(rs.getString("username").equals(userName)){
					b=false;
				}
			}
			//���û���������������ز���
			if(!b){
				System.out.println("�û����Դ��ڣ�������ע�ᣡ");
				register();
			}else{
				System.out.println("�������룺");
				String pwd=sc.next();
				System.out.println("����ȷ�����룺");
				String pwd1=sc.next();
				//�������һ��
				if(pwd.equals(pwd1)){
					System.out.println("���������ַ��");
					String email=sc.next();
					u.setUserName(userName);
					u.setPwd(pwd);
					u.setEmail(email);
					//���û����������Ƿ�Ϊ�պ������ʽ�Ƿ���ȷ�����жϣ���������ز���
					if(check.checkUser(u)){
						UserService us=new UserService();
						us.addUser(u);
						//System.out.println("�û�������");
						// ע���û���ɫ
						String i = userRegister_role(check);
						//�����û���˵�޸�Ȩ�ޱ�
						registe_Power(i);
					}else{
						userRegister();
					}
					
				}else{
					System.out.println("�������벻һ�£�������ע��");
					userRegister();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	/**
	 * �����û���ɫ�޸�Ȩ�ޱ�
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
	 * ����Աע���û���ɫ
	 * @param check
	 * @return ��ɫȨ��ֵ i
	 */
	public String register_role(CheckUtils check) {
		Role r=new Role();
		System.out.println("�������û��Ľ�ɫ:admin ���� user��");
		String role=sc.next();
		String i="";
		if(role.equals("admin") || role.equals("user")){
			r.setRoleName(role);
			i=check.checkRole(r);
			RoleService rs=new RoleService();
			rs.addRole(r);
			//System.out.println("��ɫ�������");
		}else{
			System.out.println("�����ɫ����ȷ��������ע�ᣡ");
			register_role(check);
		}
		
		return i;
	}
	/**
	 *  ����������Աע���û���ɫ Ĭ��Ϊ��ɫΪuser
	 * @param check
	 * @return ��ɫȨ��ֵ i
	 */
	public String userRegister_role(CheckUtils check) {
		Role r=new Role();
		String i="";
		String role="user";
			r.setRoleName(role);
			i=check.checkRole(r);
			RoleService rs=new RoleService();
			rs.addRole(r);
			//System.out.println("��ɫ�������");	
		return i;
	}
	
}

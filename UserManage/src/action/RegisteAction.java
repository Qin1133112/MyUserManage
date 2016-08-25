package action;

import java.sql.Connection;
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
	
}

package action;

import java.util.Scanner;

import pojo.Power;
import pojo.Role;
import pojo.User;
import service.PowService;
import service.RoleService;
import service.UserService;
import utils.CheckUtils;

public class Action {
	/**
	 * �û���Ϣע��
	 */
	public void register() {
		
		User u=new User();
		CheckUtils check=new CheckUtils();
		Scanner sc=new Scanner(System.in);
			
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

}

package action;

import java.util.Scanner;

import pojo.User;
import service.UserService;

/**
 * ��ѯ��
 * @author QinGuangrui
 *
 */

public class SelectAction {
	Scanner sc=new Scanner(System.in);
	User u=new User();
	UserService us=new UserService();
	/**
	 * ͨ��ID�Ų�ѯ
	 */
	public void selectById(){
		System.out.println("�����û�id�ţ�");
		int userid=sc.nextInt();
		u.setUserId(userid);
		us.selectUserById(u);
	}
	
	/**
	 * ͨ��ID��ģ����ѯ
	 */
	public void selectByIds(){
		System.out.println("����id����ֶΣ�");
		int userid=sc.nextInt();
		u.setUserId(userid);
		us.selectUserByIds(u);
	}
	
	/**
	 * ͨ���û�����ѯ
	 */
	public void selectByUserName(){
		System.out.println("�����û�����");
		String userName=sc.next();
		u.setUserName(userName);
		us.selectUserByName(u);
	}
	
	/**
	 * ͨ���û���ģ����ѯ
	 */
	public void selectByUserNames(){
		System.out.println("�����û�������ֶΣ�");
		String userName=sc.next();
		u.setUserName(userName);
		us.selectUserByNames(u);
	}
	/**
	 * ��ѯ�û���������Ϣ
	 */
	public void selectAll(){
		us.selectUserAll(u);
	}

}

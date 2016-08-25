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

package utils;

import pojo.Role;
import pojo.User;

/**
 * ��鹤����
 * @author QinGuangrui
 *
 */
public class CheckUtils {
	
	/**
	 * ����û��Ƿ�Ϸ�
	 * @param u
	 * @return flag
	 */
	public boolean checkUser(User u){
		boolean flag=false;
		if(u.getUserName() != null ){
			if(u.getPwd()!=null){
				if(u.getEmail()!=null){
					flag = checkEmail(u.getEmail());
				}else{
					System.out.println("����Ϊ�գ����������룡");
				}
			}else{
				System.out.println("����Ϊ�գ����������룡");
			}
		}else{
			System.out.println("�û���Ϊ��,���������룡");
			flag=false;
		}
		return flag;
	}

	/**
	 * �������ĺϷ���
	 * @param u
	 * @return flag
	 */
	public boolean checkEmail(String str) {
		boolean flag=true;
		if(str.indexOf('@')<0){
			System.out.println("����@");
			flag=false;
		}
		else if(str.indexOf('.')<0){
			System.out.println("����.");
			flag=false;
		}
		else if(str.indexOf('@')!=str.lastIndexOf('@')){
			System.out.println("���ж��@");
			flag=false;
		}
		else if(str.indexOf('.')!=str.lastIndexOf('.')){
			System.out.println("���ж��.");
			flag=false;
		}
		else if(str.indexOf('.')<str.indexOf('@')){
			System.out.println(".������@֮ǰ");
			flag=false;
		}
		return flag;
	}
	/**
	 * ����û���ɫ
	 * ��Ϊ1��admin
	 * ��Ϊ2��user
	 * ������������
	 * @param role
	 * @return
	 */
	String r="";
	public String checkRole(Role role){
		if(role.getRoleName().equals("admin")){
			System.out.println("���û���ע��Ϊ����Ա");
			r="1";
		}else if(role.getRoleName().equals("user")){
			System.out.println("���û���ע��Ϊ��ͨ�û�");
			r="2";
		}else{
			System.out.println("��ѡ�����Ա����ͨ�û�ע����Ϣ");
			r="0";
		}
		return r;
	}
}

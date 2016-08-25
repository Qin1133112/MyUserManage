package service;

import dao.UserDao;
import pojo.User;

public class UserService {
	UserDao userDao=new UserDao();
	
	/**
	 * �����û�
	 * @param u
	 * @return
	 */
	
	public boolean addUser(User u){
		
		return userDao.addUser(u);
	}
	/**
	 * �����û�ID��ѯ�û���Ϣ
	 * @param u
	 * @return
	 */
	public boolean selectUserById(User u){
		return userDao.selectUserById(u);
	}
	/**
	 * �����û�IDģ����ѯ�û���Ϣ
	 * @param u
	 * @return
	 */
	public boolean selectUserId(User u){
		return userDao.selectUserByIds(u);
	}
	/**
	 * �����û�����ѯ�û���Ϣ
	 * @param u
	 * @return
	 */
	public boolean selectUserByName(User u){
		return userDao.selectUserByName(u);
	}
	/**
	 * �����û���ģ����ѯ�û���Ϣ
	 * @param u
	 * @return
	 */
	public boolean selectUserByNames(User u){
		return userDao.selectUserByNames(u);
	}
	/**
	 * ��ѯȫ���û���Ϣ
	 * @param u
	 * @return 
	 */
	public boolean selectUserAll(User u){
		return userDao.selectUserAll(u);
	}
}

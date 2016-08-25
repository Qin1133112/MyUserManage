package service;

import dao.UserDao;
import pojo.User;

public class UserService {
	UserDao userDao=new UserDao();
	
	
	/**
	 * �û���ѯ������Ϣ
	 * @param u
	 * @return
	 */
	public boolean selectInfo(User u){
		return userDao.selectInfo(u);
	}
	
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
	public boolean selectUserByIds(User u){
		return userDao.selectUserByIds(u);
	}
	/**
	 * �����û�����ѯ�û���Ϣ
	 * @param u
	 * @return
	 */
	public boolean selectUserByName(User u){
		System.out.println("us"+u.getUserName());
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
	/**
	 * ��ͨ�û������Լ�����Ϣ
	 * @param u
	 * @return
	 */
	public boolean updateByUser(User u){
		return userDao.updateByUser(u);
	}
	
	/**
	 * ����Ա�����û�id���û����и���
	 * @param u
	 * @return
	 */
	public boolean updateById(User u){
		return userDao.updateById(u);
	}
	/**
	 * ����Աͨ���û�ID��ɾ���û�����Ϣ
	 * @param u
	 * @return
	 */
	public boolean deleteById(User u){
		return userDao.deleteById(u);
	}
}

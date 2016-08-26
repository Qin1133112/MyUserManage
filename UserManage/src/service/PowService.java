package service;

import java.sql.SQLException;

import pojo.Power;
import dao.PowerDao;

public class PowService {
	
	
	PowerDao powDao=new PowerDao();

	/**
	 * �����û�Ȩ��
	 * @param u
	 * @return flag
	 */
	
	public boolean addPow(Power p){
		return powDao.addPow(p);
	}
	/**
	 * ɾ���û�Ȩ��
	 * @param id
	 * @throws SQLException
	 */
	public void deletePow(int id) throws SQLException {
		powDao.deletePow(id);
	}
	/**
	 * �����û�id�����û�Ȩ��
	 * @param id
	 * @throws SQLException
	 */
	public void updatePow(int id) throws SQLException {
		powDao.updatePow(id);
	}
}

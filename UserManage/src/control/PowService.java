package control;

import model.PowerDao;
import pojo.Power;

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
}

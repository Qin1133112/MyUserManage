package control;

import model.RoleDao;
import pojo.Role;

public class RoleService {
	 RoleDao roleDao=new RoleDao();
	public RoleDao getRoleDao() {
		return roleDao;
	}
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}
	
	/**
	 * ���û��Ľ�ɫ���뵽��ɫ����
	 * @param r
	 * @return
	 */
	public boolean addRole(Role r){
		return roleDao.addRole(r);
	}
}

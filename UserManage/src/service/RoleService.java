package service;

import java.sql.SQLException;

import pojo.Role;
import dao.RoleDao;

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
	/**
	 * ɾ���û���ɫ
	 * @param id
	 * @throws SQLException
	 */
	public void deleteRole(int id) throws SQLException {
		roleDao.deleteRole(id);
	}
}

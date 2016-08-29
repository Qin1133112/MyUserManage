package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import pojo.User;
import service.PowService;
import service.RoleService;
import utils.CheckUtils;
import utils.ConnUtil;
import utils.Max_Id;


/**
 * �û�����
 * @author QinGuangrui
 *
 */
public class UserDao {
	
	public ConnUtil connUtil=new ConnUtil();
	public Connection conn;
	Scanner sc=new Scanner(System.in);
	Max_Id mx=new Max_Id();
	CheckUtils check=new CheckUtils();
	PowService pows=new PowService();
	RoleService rs=new RoleService();
	
	/**
	 * �û���ѯ������Ϣ
	 * @param u
	 * @return
	 */
	public boolean selectInfo(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String userName=u.getUserName();
		String sql="select userid,username,pwd,email from userinfo where userName=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, userName);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("�û�id:"+rs.getInt("userid"));
				System.out.println("�û���:"+rs.getString("username"));
				System.out.println("�û�����:"+rs.getString("pwd"));
				System.out.println("�û�����:"+rs.getString("email"));
				System.out.println("***********************************");
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	/**
	 * �����û�
	 * @param u
	 * @return flag
	 */
	
	public boolean addUser(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		try {
			int n = mx.select_maxUserId();
			String sql="insert into userInfo values(?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, n+1);
			ps.setString(2, u.getUserName());
			ps.setString(3, u.getPwd());
			ps.setString(4, u.getEmail());
			ps.execute();
			conn.commit();
			flag=true;	
		} catch (SQLException e) {
			System.out.println("ע��ʧ��");
			//e.printStackTrace();
		}
		return flag;
	}
	/**
	 * ����Ա�����û�ID��ѯ�û���Ϣ
	 * @param u
	 * @return
	 */
	public boolean selectUserById(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String sql="select u.userid userid,username,pwd,email,pow,rolename "
						+ "from userinfo u,pow p,u_role r "
						+ "where u.userid=p.userid and p.userid=r.userid and u.userid = ? ";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, u.getUserId());
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("�û�id:"+rs.getInt("userid"));
				System.out.println("�û���:"+rs.getString("username"));
				System.out.println("�û�����:"+rs.getString("pwd"));
				System.out.println("�û�����:"+rs.getString("email"));
				System.out.println("�û�Ȩ��ֵ��"+rs.getString("pow"));
				System.out.println("�û���ɫ��"+rs.getString("rolename"));
				System.out.println("************************");
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	/**
	 * ����Ա�����û�IDģ����ѯ�û���Ϣ
	 * @param u
	 * @return
	 */
	public boolean selectUserByIds(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		
		int id=u.getUserId();
		String userId="%"+id+"%";
		String sql="select u.userid userid,username,pwd,email,pow,rolename "
						+ "from userinfo u,pow p,u_role r "
						+ "where u.userid=p.userid and p.userid=r.userid and u.userid like ? ";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,userId);
			ps.execute();
			ResultSet rs=ps.getResultSet();
			while(rs.next()){
				System.out.println("�û�id:"+rs.getInt("userid"));
				System.out.println("�û���:"+rs.getString("username"));
				System.out.println("�û�����:"+rs.getString("pwd"));
				System.out.println("�û�����:"+rs.getString("email"));
				System.out.println("�û�Ȩ��ֵ��"+rs.getString("pow"));
				System.out.println("�û���ɫ��"+rs.getString("rolename"));
				System.out.println("************************");
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			System.out.println("��ѯ����������ѡ�������");
			//e.printStackTrace();
		}
		return flag;
	}
	/**
	 * ����Ա�����û�����ѯ�û���Ϣ
	 * @param u
	 * @return
	 */
	public boolean selectUserByName(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String sql="select u.userid userid,username,pwd,email,pow,rolename "
						+ "from userinfo u ,pow p,u_role r "
						+ "where u.userid=p.userid and p.userid=r.userid and userName like ?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, u.getUserName());
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("�û�id:"+rs.getInt("userid"));
				System.out.println("�û���:"+rs.getString("username"));
				System.out.println("�û�����:"+rs.getString("pwd"));
				System.out.println("�û�����:"+rs.getString("email"));
				System.out.println("�û�Ȩ��ֵ��"+rs.getString("pow"));
				System.out.println("�û���ɫ��"+rs.getString("rolename"));
				System.out.println("************************");
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			System.out.println("��ѯ����������ѡ�������");
			//e.printStackTrace();
		}
		return flag;
	}
	/**
	 * ����Ա�����û���ģ����ѯ�û���Ϣ
	 * @param u
	 * @return
	 */
	public boolean selectUserByNames(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String sql="select u.userid userid,username,pwd,email,pow,rolename "
						+ "from userinfo u ,pow p,u_role r "
						+ "where u.userid=p.userid and p.userid=r.userid and userName like ?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, "%"+u.getUserName()+"%");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("�û�id:"+rs.getInt("userid"));
				System.out.println("�û���:"+rs.getString("username"));
				System.out.println("�û�����:"+rs.getString("pwd"));
				System.out.println("�û�����:"+rs.getString("email"));
				System.out.println("�û�Ȩ��ֵ��"+rs.getString("pow"));
				System.out.println("�û���ɫ��"+rs.getString("rolename"));
				System.out.println("************************");
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			System.out.println("��ѯ����������ѡ�������");
			//e.printStackTrace();
		}
		return flag;
	}
	/**
	 * ����Ա��ѯȫ���û���Ϣ
	 * @param u
	 * @return 
	 */
	public boolean selectUserAll(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String sql="select u.userid userid,username,pwd,email,pow,rolename "
				+ "from userinfo u,pow p,u_role r "
				+ "where u.userid=p.userid and p.userid=r.userid";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("�û�id:"+rs.getInt("userid"));
				System.out.println("�û���:"+rs.getString("username"));
				System.out.println("�û�����:"+rs.getString("pwd"));
				System.out.println("�û�����:"+rs.getString("email"));
				System.out.println("�û�Ȩ��ֵ��"+rs.getString("pow"));
				System.out.println("�û���ɫ��"+rs.getString("rolename"));
				System.out.println("************************************");
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			System.out.println("��ѯ����������ѡ�������");
			//e.printStackTrace();
		}
		return flag;
	}
	
	/**
	 * ��ͨ�û������Լ�����Ϣ
	 * @param u
	 * @return
	 */
	public boolean updateByUser(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String user=u.getUserName();
		System.out.println(user);
		System.out.println("������ĵ��û�����");
		String userName=sc.next();
		System.out.println("���������룺");
		String pwd=sc.next();
		System.out.println("����ȷ�����룺");
		String pwd1=sc.next();
		
		String sql="update userinfo set username=?,pwd=?,email=? where username = ?";
		if(pwd.equals(pwd1)){
			System.out.println("���������ַ��");
			String email=sc.next();
			if(check.checkEmail(email)){
				try {
					PreparedStatement ps=conn.prepareStatement(sql);
					ps.setString(1, userName);
					ps.setString(2, pwd);
					ps.setString(3, email);
					ps.setString(4, user);
					ps.execute();
					conn.commit();
					System.out.println("�޸ĳɹ�");
					u.setUserName(userName);
					flag=true;
				} catch (SQLException e) {
					System.out.println("���´���");
					e.printStackTrace();
				}
			}
			
		}else{
			System.out.println("�����������벻��ȷ�������²�����");
		}
		return flag;
	}
	/**
	 * ����Ա�����û�id���û����и���
	 * @param u
	 * @return
	 */
	public boolean updateById(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		System.out.println("����Ҫ�޸ĵ��û�ID��");
		int id=sc.nextInt();
		String sql="select userid from userinfo";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				if(rs.getInt("userid")==id ){				//�ж���û���û�
					System.out.println("������ĵ��û�����");
					String userName=sc.next();
					System.out.println("���������룺");
					String pwd=sc.next();
					System.out.println("����ȷ�����룺");
					String pwd1=sc.next();
					
					String sql1="update userinfo set username=?,pwd=?,email=? where userid= ?";
					if(pwd.equals(pwd1)){
						System.out.println("���������ַ��");
						String email=sc.next();
						if(check.checkEmail(email)){
							PreparedStatement ps1=conn.prepareStatement(sql1);
							ps1.setString(1, userName);
							ps1.setString(2, pwd);
							ps1.setString(3, email);
							ps1.setInt(4, id);
							ps1.execute();
							System.out.println("�޸ĳɹ�");
							pows.updatePow(id);																//���������id����Ȩ��
							conn.commit();
							flag=true;
						}
						
					}else{
						System.out.println("�����������벻��ȷ�������²�����");
					}
				}
			}
		} catch (SQLException e) {
			System.out.println("����ʧ�ܣ������²�����");
			try {
				conn.rollback();
				updateById(u);
			} catch (SQLException e1) {

				//e1.printStackTrace();
			}
			//e.printStackTrace();
		}
		return flag;
	}
	
	/**
	 * ����Աͨ���û�ID��ɾ���û�����Ϣ
	 * @param u
	 * @return
	 */
	public boolean deleteById(User u){
		boolean flag=false;
		boolean b=true;																		//�ж��Ƿ����ѭ��
		conn=connUtil.getConn();
		while(b){
			System.out.println("����Ҫɾ�����û�ID�ţ�");
			int id=sc.nextInt();
			if(id==u.getUserId()){
				System.out.println("��ǰ�û��޷�ɾ��������������ID!");
			}else{
				String sql1="select userid from userinfo where userid = ?";
				try {
					PreparedStatement ps1=conn.prepareStatement(sql1);
					ps1.setInt(1, id);
					ps1.execute();
					ResultSet rs1=ps1.getResultSet();
					if(rs1.next()){
						String sql="delete from userinfo where userid = ?";
						try {
							PreparedStatement ps=conn.prepareStatement(sql);
							ps.setInt(1,id);
							ps.executeUpdate();
							pows.deletePow(id);													//����useridɾ���û�Ȩ��					
							rs.deleteRole(id);													//����useridɾ���û���ɫ
							conn.commit();
							System.out.println("ɾ���û�" + id + "�ɹ�");
							System.out.println("����ɾ��������1�����������������һ��");
							String a=sc.next();
							if(!a.equals("1")){
								b=false;
								
							}
							flag=true;
						} catch (SQLException e) {
							System.out.println("ɾ�����̳���,�����²�����");
							try {
								conn.rollback();
								deleteById(u);
							} catch (SQLException e1) {
								//e1.printStackTrace();
							}
						}
					}else{
						System.out.println("�û������ڣ������²�����");
						deleteById(u);
					}
					
				} catch (SQLException e2) {
					System.out.println("��������");
					deleteById(u);
				}
	
			}
		}		
		return flag;
	}
}

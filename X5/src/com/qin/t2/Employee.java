package com.qin.t2;

public class Employee {
	private String eno;//Ա�����
	private String name;
	private float sal;//����нˮ
	private float per;//нˮ������
	public void setEno(String eno){
		this.eno=eno;
	}
	public String getEno(){
		return eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	//нˮ������
	public float incre(){
		return sal*per;
	}
	
	//���������ܶ�
	public float sum(){
		return sal*(1+per);
	}
	
}

package com.qin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class T_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//systemDate();
		shijian("2009-12-2 4:13:24");
	}
	static void systemDate(){
		Date d=new Date();
		Date d1=new Date();
		Date d2=new Date();
		d1.setHours(d.getHours()-7);
		d2.setHours(d.getHours()-12);
		System.out.println("����ʱ��Ϊ��"+(d.getYear()+1900)+"��"+(d.getMonth()+1)+"��"+d.getDay()+"��"+d.getHours()+"ʱ"+d.getMinutes()+"��");
		System.out.println("����ʱ��Ϊ��"+(d1.getYear()+1900)+"��"+(d1.getMonth()+1)+"��"+d1.getDay()+"��"+d1.getHours()+"ʱ"+d1.getMinutes()+"��");
		System.out.println("ŦԼʱ��Ϊ��"+(d2.getYear()+1900)+"��"+(d2.getMonth()+1)+"��"+d2.getDay()+"��"+d2.getHours()+"ʱ"+d2.getMinutes()+"��");
	}
	static void shijian1(int a,int b,int c){
		Calendar ca=Calendar.getInstance();
		Calendar ca1=Calendar.getInstance();
		Calendar ca2=Calendar.getInstance();
		ca.set(2016, 8,16,a,b,c);
		int year=ca.get(Calendar.YEAR);
		int month=ca.get(Calendar.MONTH);
		int day=ca.get(Calendar.DAY_OF_MONTH);
		int hour=ca.get(Calendar.HOUR);
		int min=ca.get(Calendar.MINUTE);
		int second=ca.get(Calendar.SECOND);
		System.out.println("����ʱ��Ϊ��"+year+"��"+month+"��"+day+"��"+hour+"ʱ"+min+"��"+second+"��");
		System.out.println("����ʱ��Ϊ��"+year+"��"+month+"��"+day+"��"+hour+"ʱ"+min+"��"+second+"��");
		System.out.println("ŦԼʱ��Ϊ��"+year+"��"+month+"��"+day+"��"+hour+"ʱ"+min+"��"+second+"��");
	}
	@SuppressWarnings("deprecation")
	static void shijian(String s){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date d=sdf.parse(s);
			String a=sdf.format(d);
			System.out.println("����ʱ�䣺"+a);
			Date d1=d;
			int h=d.getHours();
			d.setHours(h-7);
			String b=sdf.format(d);
			System.out.println("����ʱ�䣺"+b);
			d1.setHours(h-12);
			String c=sdf.format(d1);
			System.out.println("ŦԼʱ�䣺"+c);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

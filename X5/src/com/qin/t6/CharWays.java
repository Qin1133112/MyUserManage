package com.qin.t6;

public class CharWays {
	public static void main(String args[]){
		String s1="Java����ѧϰ��20070326";
		String s=s1.substring(9);
		System.out.println("�������ڣ�"+s);
		String s2="MLDN JAVA";
		s=s2.replace("JAVA", "J2EE");
		System.out.println("�滻��"+s);
		s=s1.substring(7, 8);
		System.out.println(s1+"�ĵڰ˸��ַ�Ϊ��"+s);
		s=s1.replace("0", "");
		System.out.println(s1+"ȥ������0��"+s);
		String s3="Java����ѧϰ��   20070326 MLDN ��ʦ";
		s=s3.replace(" ", "");
		System.out.println(s3+"ȥ�����пո��"+s);
		String s4="678123199507142230";
		s=s4.substring(6, 14);
		System.out.println("���˵ĳ������ڣ�"+s);
	}
}

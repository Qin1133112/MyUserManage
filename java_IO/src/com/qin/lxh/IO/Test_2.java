package com.qin.lxh.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Test_2 {
/*
 * �Ӽ��������ļ����ݺ�Ҫ������ļ�����
 * Ȼ�������������ƴ����ļ�
 * �������ݱ��浽�ļ���
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("�����ļ������ݣ�");
		String s=sc.nextLine();
		System.out.println("�����ļ����ƣ�");
		String m=sc.next();
		String path="D:"+File.separator+"test"+File.separator+m+".txt";
		File f=new File(path);
		if(!f.exists()){
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		OutputStream os=null;
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		try {
			os=new FileOutputStream(f);
			osw=new OutputStreamWriter(os);
			bw=new BufferedWriter(osw);
			
			try {
				bw.write(s);
				bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(bw!=null){
				bw.close();
			}
				
			if(osw!=null){
				osw.close();
			}
				
			if(os!=null){
				os.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("��û�������ر�");
			e.printStackTrace();
		}
		
		System.out.println("���");
		
	}

}

package com.qin.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Clent_2 {

	public static void main(String[] args) {
		BufferedReader br = null;
		 String clientStr="";
		try {
			//����ͨ�Ŷ˿ڣ�����������˷���ͨ������
			Socket s = new Socket("127.0.0.1",4001);
		    System.out.println("��������˽�������");
		    Send send = new Send(s);
			Thread t1 = new Thread(send);
			t1.start();
			   while(true){
				    
					//��ȡ�ͻ���ͨ�ŵ���Ϣ
					 br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				     clientStr = br.readLine();
				    System.out.println("��������˵��"+clientStr);
			   }
		    
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package com.qin;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Layout_Test {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		//flowLayout(frame);
		//borderLayout(frame);
		//gridLayout(frame);
		//cardLayout(frame);
		absolutely_Flowout(frame);
	}
	/*
	 * ���Զ�λsetBounds(int x,int y,int width,int heigth)
	 * (x,y)λ�����Ͻ�����
	 */
	public static void absolutely_Flowout(JFrame frame) {
		frame.setLayout(null);
		JLabel title=new JLabel("www.com.cn");
		JButton enter=new JButton("����");
		JButton help=new JButton("����");
		frame.setSize(200,90);
		title.setBounds(45,5,150,20);
		enter.setBounds(10,30,80,20);
		help.setBounds(100,30,80,20);
		frame.add(title);
		frame.add(enter);
		frame.add(help);
		frame.setVisible(true);
	}
	/*
	 * CardLayout�ǽ�һ������ص��ؽ��в��֣��翨Ƭһ�㣬ÿ��ֻչ��һ������
	 */
	public static void cardLayout(JFrame frame) {
		Container cont=frame.getContentPane();//ȡ�ô�������
		CardLayout card=new CardLayout();
		frame.setLayout(card);
		cont.add(new JLabel("��ǩA",JLabel.CENTER),"first");
		cont.add(new JLabel("��ǩB",JLabel.CENTER),"second");
		cont.add(new JLabel("��ǩC",JLabel.CENTER),"third");
		cont.add(new JLabel("��ǩD",JLabel.CENTER),"fourth");
		cont.add(new JLabel("��ǩE",JLabel.CENTER),"fifth");
		frame.pack();
		frame.setVisible(true);
		card.show(cont, "third");
		for(int i=0;i<5;i++){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			card.next(cont);
		}
	}
	/*
	 * GridLayout�Ա����ʽ���й�������������ʾ������������
	 * �������Ĳ�����ʹ�ô˲���
	 */
	public static void gridLayout(JFrame frame) {
		frame.setLayout(new GridLayout(3,5,3,3));//�У��У�ˮƽ��࣬��ֱ���
		JButton but=null;
		for(int i=0;i<13;i++){
			but=new JButton("��ť"+i);
			frame.add(but);
		}
		frame.pack();
		frame.setVisible(true);
	}
	/*
	 * BorderLayout�������ֶ����������������
	 */
	public static void borderLayout(JFrame frame) {
		frame.setLayout(new BorderLayout(3,3));
		frame.add(new JButton("��"),BorderLayout.EAST);
		frame.add(new JButton("��"),BorderLayout.SOUTH);
		frame.add(new JButton("��"),BorderLayout.WEST);
		frame.add(new JButton("��"),BorderLayout.NORTH);
		frame.add(new JButton("��"),BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
	/*
	 * ��ʽ���ֹ�����
	 */
	public static void flowLayout(JFrame frame) {
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,3,3));
		JButton but=null;
		for(int i=0;i<9;i++){
			but=new JButton("��ť"+i);
			frame.add(but);
		}
		frame.setSize(280,123);
		frame.setVisible(true);
	}

}

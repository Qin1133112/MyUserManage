package com.qin;

import java.util.ArrayList;
import java.util.List;

public class J_21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fun();
		maoGoYu();
	}
	static List<String> l=new ArrayList<String>();
	static List<String> r=new ArrayList<String>();
	static void maoGoYu(){
		
		l.add("cat");
		l.add("dog");
		l.add("fish");
		take();
		
	}
	//�ж϶���֮���Ƿ�ȫ
	public static boolean isSafty(List<String> list){
		if(list.add("cat")&&list.add("fish")||list.add("cat")&&list.add("dog")){
			return false;
		}else{
			return true;
		}
	}
	
	//�ϲ������߶���
	public static void take(){
		String an=l.get(0);//���߶���
		l.remove(l.get(0));//��ȥ���ߵĶ���
		if(an.equals("cat")){
			r.add(an);
			
			if(l.isEmpty()){
				//System.out.println();
				System.out.println("��"+an+"������");
			}else{
				System.out.println("������"+an);
				System.out.print("ʣ�£�");
				for(String s:l){
					System.out.print(s+" ");
				}
				System.out.println();
				System.out.println("-----------------------------");
				take();
			}
		}else if(an.equals("dog")){
			r.add(an);
			System.out.println("��"+an+"������");
			if(isSafty(r)){
				take();
			}else{
				System.out.print("ʣ�£�");
				for(String s:l){
					System.out.print(s+" ");
				}
				System.out.println();
				String animal=r.get(0);
				r.remove(animal);
				l.add(animal);
				System.out.println("��"+animal+"����");
				
				System.out.println("-----------------------------");
				take();
			}
		}else if(an.equals("fish")){
			r.add(an);
			System.out.println("��"+an+"����");
			System.out.print("ʣ�£�");
			for(String s:l){
				System.out.print(s+" ");
			}
			System.out.println();
			if(isSafty(r)){
				take();
			}
			System.out.println();
			System.out.println("-----------------------------");
			take();
		}
	}

}

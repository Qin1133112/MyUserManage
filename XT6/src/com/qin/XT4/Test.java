package com.qin.XT4;

//import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("����ѧ��������");
		int n=sc.nextInt();
		Student s[]=new Student[n];
		System.out.println("����       ѧ��      �ɼ�");
		for(int i=0;i<n;i++){
			String name=sc.next();
			int sno=sc.nextInt();
			float score=sc.nextFloat();
			s[i].setName(name);
			s[i].setSno(sno);
			s[i].setScore(score);
		}*/
		
		Student s[]=new Student[6];
		s[0]=new Student("����",1101,98);
		s[1]=new Student("����",1102,88);
		s[2]=new Student("����",1103,100);
		s[3]=new Student("����",1104,75);
		s[4]=new Student("����",1105,76);
		s[5]=new Student("����",1106,90);
		System.out.println("����      ѧ��           �ɼ�");
		System.out.println("--------------");
		Student temp[]=new Student[1];
		for(int i=0;i<6;i++){
			for(int j=i;j<6;j++){
				if(s[i].getScore()<s[j].getScore()){
					temp[0]=s[i];
					s[i]=s[j];
					s[j]=temp[0];
					
				}
				//s[i].showInfo();
			}	
			s[i].showInfo();
		}

	}

}

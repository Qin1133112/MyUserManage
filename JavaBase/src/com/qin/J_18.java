package com.qin;

public class J_18 {

	public static void main(String[] args) {
		char i,j,k;
		for(i='x';i<='z';i++){//i����a�Ķ���
			for(k='x';k<='z';k++){//k����b�Ķ���
				if(i!=k){
					for(j='x';j<='z';j++){//j����c�Ķ���
						if( k!=j && j!=i ){
							if(i!='x' && (j!='x') && (j!='z')){
								
								System.out.println("a ==> "+i+",b ==> "+k+",c ==> "+j);
							}
						}
					}
				}
			}
		}
	}

}

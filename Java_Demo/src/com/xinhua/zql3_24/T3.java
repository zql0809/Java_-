package com.xinhua.zql3_24;

public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tag = 0;
		for (int i = 101; i < 200; i++) {
			if(i%4 == 0 && tag<5){
				tag++;
				System.out.println("ÄÜ±»4Õû³ý:"+i);
			}
		}
	}

}

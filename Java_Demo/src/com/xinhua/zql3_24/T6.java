package com.xinhua.zql3_24;

public class T6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 1000; i++) {
			int a = i/100;
			int b = i%100/10;
			int c = i%10;
			if(a*a*a+b*b*b+c*c*c == i)
			{
				System.out.println("ˮ�ɻ�����"+i);
			}
		}
	}

}

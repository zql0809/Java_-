package com.xinhua.zql3_24;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 0;
		int a;
		
		Scanner input = new Scanner(System.in);
		System.out.println("������aֵ��");
		a = input.nextInt();
		System.out.println("������Ҫ�õ�ǰ������ĺͣ�");
		int n = input.nextInt();
		int temp = a;
		
		for(int i=0; i<n ;i++){
			s = a + s;
			a = a*10 +temp;
		}
		System.out.println(s);
	}

}

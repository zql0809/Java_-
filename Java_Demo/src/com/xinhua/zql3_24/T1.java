package com.xinhua.zql3_24;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 0;
		int a;
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入a值：");
		a = input.nextInt();
		System.out.println("输入想要得到前多少项的和：");
		int n = input.nextInt();
		int temp = a;
		
		for(int i=0; i<n ;i++){
			s = a + s;
			a = a*10 +temp;
		}
		System.out.println(s);
	}

}

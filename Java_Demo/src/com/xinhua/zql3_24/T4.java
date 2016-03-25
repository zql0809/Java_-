package com.xinhua.zql3_24;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入三角行的行数：");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
		for (int i = 1; i < a+1; i++) {
			for (int j = 0; j <= a-i; j++) {
				System.out.print("  ");
			}
			
			for (int k = 0; k < 1+2*(i-1); k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}

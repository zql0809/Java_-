package com.xinhua.zql3_24;

import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入菱形的行数(奇数)：");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int t =a/2;
		
		for (int i = 1; i <= t; i++) {
			for (int j = 0; j <= a-i-1; j++) {
				System.out.print("  ");
			}
			
			for (int k = 0; k < 1+2*(i-1); k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		for (int i = a-t; i >0; i--) {
			for (int j = 0; j <= a-i-1; j++) {
				System.out.print("  ");
			}
			
			for (int k = 0; k < 1+2*(i-1); k++) {
				System.out.print(" *");
			}
			System.out.println();	
		}
		
	}

}

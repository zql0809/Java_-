package com.xinhua.zql3_24;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 //ͬһ�����������ֱ��ʹ�ã�  ��ͬ�������������
		printFlower();
	}
	
	public static void printFlower(){
		boolean b = true;
		while(b){
			System.out.println("������һ��ˮ�ɻ���");
			Scanner input = new Scanner(System.in);
			String f = input.nextLine();
			int num = f.length();
			int s = 0;
			System.out.println("ˮ�ɻ���λ����:"+num);
			
			int a = Integer.parseInt(f);
			int[] c = new int[num+1];
			
			
			for (int i = 1; i <= num; i++) {
			    if(i == 1){
			    	c[i] = a/(int)Math.pow(10, num-1);
			    }else if(i == num){
			    	c[i] = a%10;
			    }else{
			    	c[i] = a/(int)Math.pow(10, num-i)%10;
			    }
			}
			
			
			for (int i = 1; i < num+1; i++) {
				s = (int)Math.pow(c[i],3) + s;
			}
			
			if(s == a){
				System.out.println("������ˮ�ɻ�������ֹ���룡");
				b = false;
			}else{
				System.out.println("��������ˮ�ɻ�������������룡");
			}
		}
	}

}

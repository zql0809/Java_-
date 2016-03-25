package com.xinhua.zql3_24;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 //同一个包的类可以直接使用！  不同包的引入就行了
		printFlower();
	}
	
	public static void printFlower(){
		boolean b = true;
		while(b){
			System.out.println("请输入一个水仙花数");
			Scanner input = new Scanner(System.in);
			String f = input.nextLine();
			int num = f.length();
			int s = 0;
			System.out.println("水仙花数位数是:"+num);
			
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
				System.out.println("该数是水仙花数！终止输入！");
				b = false;
			}else{
				System.out.println("该数不是水仙花数，请继续输入！");
			}
		}
	}

}

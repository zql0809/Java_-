package com.xinhua.zql3_24;

public class Demo3 {
	static int k = 1;
	static double s = 0;
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根//练习while
//		digui2(4);
		double a = fun(100);
		System.out.println(a);
	}
	public static void digui(int n){
		int s = n;
		while(n-- -1>0){
			System.out.println(n);
		    s = s*n;
		}
		System.out.println(s);
	}
	public static void digui1(int n){
		int s = n;
		while(--n -1>=0){
			System.out.println(n);
			s = s*n;
		}
		System.out.println(s);
	}
	public static void digui2(int n){
		int i = 1,s=1,total=0;
		
		while(++i <= n){
//			System.out.println(i);
			s = s+i;
			total = total + s;
		}
		System.out.println(s);
		System.out.println(total);
	}
	
	public static double fun(int n){
		k = -k;
		if(n == 1)
			return 1;
		else{
			return k*1.0/n+fun(n-1);
		}
	}
	

}

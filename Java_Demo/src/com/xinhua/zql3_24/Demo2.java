package com.xinhua.zql3_24;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**************************");
		System.out.print("1.���������ֵ"+"  "+"2.�ⶨ����"+"  "+"3.�ж���Сд"+"  "+"4.�ж��ɼ��ȼ�"+"   "+"\n"+
		"5.��1-100�ĺ�"+"   "+"6.��1-100���ܱ�3����"+"   "+"7.101-200ǰ5λ�ܱ�4����"+"   "+
				"8.��Ԫ��ټ�"+"\n"+"9.���쳲���������ĳһ��"+"   "+"10.���1��1/2+1/3��1/4+1/5�� �� +1/99��1/100"+"\n");
		Scanner input1 = new Scanner(System.in);
		System.out.println("ѡ����Ҫʹ�õĺ�����");
		int a = input1.nextInt();
		Demo2 t1 = new Demo2(); 
		
		switch (a) {
		case 1:
			System.out.println("���ֵ�ǣ�"+t1.max());
			break;
		case 2:
			System.out.println(t1.runNian());
			break;
		case 3:
			System.out.println(t1.judge());
			break;
		case 4:
			System.out.println(t1.gride());
			break;
		case 5:
			System.out.println(t1.qiuhe());
			break;
		case 6:
			t1.fun1_chusan();
			break;
		case 7:
			t1.fun2_chusi();
			break;
		case 8:
			t1.fun_chilken();
			break;
		case 9:
			t1.fun_fib();
			break;
		case 10:
			t1.fun3_qiuhe();
			break;

		default:
			break;
		}
	}
	
	public double max(){
		System.out.println("������������");
		Scanner a = new Scanner(System.in);
		int x = a.nextInt();
		int y = a.nextInt();
		return x>y?x:y;
	}
	
	 public String runNian(){
		 
		System.out.println("����һ����ݣ�");
		Scanner a = new Scanner(System.in);
		int x = a.nextInt();
		return (x%4 == 0 &&x%100!=0)||x%400 == 0?"����":"��������"; 
	 }
	 
	 public String judge(){
		char a =  (char) (Math.random()*128);
		System.out.print(a+"��");
		String b= (a>= 'A' && a <= 'Z')?"��д��ĸ":(a>='a' && a<='z')?"Сд��ĸ":(a>='0'&&a<='9')?"����":"�����ַ�";
		
		return b;
	 }
	 public String gride(){
		 System.out.println("����һ���ɼ���");
		 Scanner input = new Scanner(System.in);
		 int a = input.nextInt();
		 String b = a>=90?"A":a>=80?"B":a>=70?"C":
			 "D";
		 return b;
	 }

	 public int qiuhe(){
		 int s = 0;
		 int i = 0;
		 while(i++ <100){
			 s = s + i;
		 }
		 return s;
	 }
	 
	 public void fun1_chusan(){
		 for (int i = 0; i < 100; i++) {
			if(i%3 != 0){
				continue;
			}else
				System.out.println(i);
		}
	 }
	 public  void fun2_chusi(){
		 int tag = 0;
		 for (int i = 101; i < 201; i++) {
			if(i%4 == 0 && tag<=4){
				System.out.println(i);
				tag++;
			}
		}
	 }
	 
	 public void fun_chilken(){
		 for (int x = 0; x <= 100; x++) {
			for (int y = 0; y <= 100; y++) {
				int z = 100 - x - y;
				if(5*x+3*y+z/3 == 100 && z%3==0){
					System.out.println("x:"+x+"y:"+y+"z:"+z);
				}
			}
		}
	 }
	 public  void fun_fib(){
		 System.out.println("����쳲��������е��");
		 Scanner input =  new Scanner(System.in);
		 int a = input.nextInt();
		 double d =  fib(a);
		 System.out.println(d);
	 }
	 
	 public static int fib(int n){ 
		 if(n == 2 || n==1){
			 return 1;
		 }
		 else{
			 return  fib(n-1)+fib(n-2);
		 }
	 }
	 public void fun3_qiuhe(){
		 int k = 1;
		 double s = 0;
		 for (int i = 1; i < 100; i++) {
			s = s + k*1.0/i;
			k = -k;
		}
		 System.out.println(s);
	 }

}

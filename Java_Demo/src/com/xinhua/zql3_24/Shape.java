package com.xinhua.zql3_24;

public interface Shape {
	float pi = 3.1415f;
    void fun_Area();
    void fun_Long();
    void show();
    void set(int l);
}
class Circle implements Shape{
	int r;
	public void fun_Area(){
		System.out.println("����ǣ�"+pi*r*r);
	}
	public void fun_Long(){
		System.out.println("�ܳ��ǣ�"+2*pi*r);
	}
	public void show(){
		System.out.println("����һ��ԲԲԲԲ");
	}
	public void set(int l){
		this.r = l;
	}
 }

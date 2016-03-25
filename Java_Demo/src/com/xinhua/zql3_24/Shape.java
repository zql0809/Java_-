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
		System.out.println("面积是："+pi*r*r);
	}
	public void fun_Long(){
		System.out.println("周长是："+2*pi*r);
	}
	public void show(){
		System.out.println("这是一个圆圆圆圆");
	}
	public void set(int l){
		this.r = l;
	}
 }

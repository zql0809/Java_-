package com.xinhua.zql3_24;

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		suShu(100);
	}
	
	public static void suShu(int n){
		int i = 2;
		while(i<=n){
			if(i == 2 || i == 3){
				System.out.println("������"+i);
			}else{
				boolean b =true;
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if(i%j == 0){
						b = false;
						break;}else{
							b = true;
						}
				}
				if(b == true)
					System.out.println("������"+i);
			}
			i++;
		}
	}

}

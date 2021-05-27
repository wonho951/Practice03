package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		
		for (int num =1; num<=100; num++) {
			if(num%5 ==0 && num%7==0)  {
				System.out.println(num);
				//break 걸 경우 제일 최초에 만족되는 값만 출력.
			}
		}

	}

}

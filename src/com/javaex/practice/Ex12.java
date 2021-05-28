package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		
		int n = 1;								//n!의 값을 입력할 변수  = 기본값 0이 되면 안되므로 1
		int num = sc.nextInt();					//입력받을 값.
		
		for(int i = 1; i <= num; i++) {			// 입력받은 값보다 작거나 같을때 반복
			n=n*i;								
		}

				
		System.out.println("결과값 :" + n);
		
		sc.close();
		

	}

}

package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
				
		System.out.println("숫자를 입력하세요");	
		int max = 0 ;             // max값에 num값을 저장해야 하므로 0으로 초기화.
		
		
		for(int i = 1; i<=5; i++ ) {   // 몇번 반복할지 정하는 값.
			
			System.out.print("숫자 :");	
			int num = sc.nextInt();
			
			if (num > max) {
				
				max = num;	  // = 은 대입의 의미. 잊지말고 기억하기. num의 값은 max 아님. max값을 num에 대입.			
			}				
			
		}		
		System.out.println("최대값은 " + max + "입니다.");
		
		sc.close();		
	}

	

}

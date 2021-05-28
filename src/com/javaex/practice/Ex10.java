package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
				
		System.out.println("숫자를 입력하세요");	
		int max = 0 ;
		
		
		for(int i = 1; i<=5; i++ ) { 
			
			System.out.print("숫자 :");	
			int num = sc.nextInt();
			
			if (num > max) {
				
				max = num;	  // = 은 대입의 의미. 잊지말고 기억하기. num = max ㄴㄴ			
			}				
			
		}		
		System.out.println("최대값은 " + max + "입니다.");
		
		sc.close();		
	}

	

}

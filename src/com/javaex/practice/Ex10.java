package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int max;	
		int i; 
		
		for( max=1; max<=5; max++) {
			
			for(i=1; i<=5; i++) {				
				System.out.print("숫자 :");	
				max = sc.nextInt();
			}			
			
			System.out.println("최대값은 " + max + "입니다.");
		}
		
		
		
		
		
		
		sc.close();		
	}

	

}

package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=======================================");
		System.out.println("	[숫자맞추기게임 시작]	");
		System.out.println("=======================================");
		
		
		
		int num ;
		
		int answer = (int)(Math.random()*100)+1;           //랜덤값 생성. (강제형변환 시킴.)
		
		
		
		while (true) {
			
			System.out.print(">>");
			
			num = sc.nextInt();
			
			
			if (num == answer) {
				
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까? (y/n) >>");				
				String exit = sc.nextLine();  
				
				if (exit.equals("y")) {
					
					System.out.println("=======================================");
					System.out.println("	[숫자맞추기게임 종료]	");
					System.out.println("=======================================");
						break;
						
				} else {
					System.out.println("재시작");
					continue;
				}				
				
			} if (num>answer) {
				System.out.println("더 낮게");
			}else {
				System.out.println("더 높게");
								
			}
			
			
		}
		
		
		
		
		
		
		sc.close();
		
	
		
	}
}

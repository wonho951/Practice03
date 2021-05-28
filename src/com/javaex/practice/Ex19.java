package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int a = 0;		
		int w = 0;
		int save = 0;
		
		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			int num = sc.nextInt();
			
			if(num==4) {
				System.out.print("프로그램 종료");
				break;
			} else if (num==1) {
				System.out.print("예금액>");
				
				save = sc.nextInt();				
				a=a+save;
				
			} else if (num == 2) {
				System.out.print("출금액>");
				w = sc.nextInt();				
				a=save-w;
				
			} else if ( num == 3) {
				System.out.print("잔고액>" + a);
				
			} else {
				
				System.out.print("다시 입력해주세요.");
			}
			
			System.out.println("");
		}
		
		sc.close();
	}

}

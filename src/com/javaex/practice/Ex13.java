package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		
		//12번 팩토리얼 문제랑 같음.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		
		int num = sc.nextInt();
		
		int n = 0;
		
		for (int i = 1; i <= num; i++) {
			n = n+i;
		}
		
		System.out.println("합계 : " + n);
		
		sc.close();
		

	}

}

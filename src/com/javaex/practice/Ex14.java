package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 :");
		
		int num = sc.nextInt();
		int n = 0;
		
		
		
		for (int i = 1; i <= num; i++) {
			n=n+i;
			System.out.print(i);
			if (i<num) {
				System.out.print("+");
			}
		}
			
		
		System.out.println("");
		System.out.println("합계 : " + n);
		
		sc.close();

	}

}

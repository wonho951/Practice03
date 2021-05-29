package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int num = sc.nextInt();
		int x;
		
		for(int y=1; y<=num; y++) {          //세로		 세로줄 수 = num
			for (x=1; x<=y-1; x++) {         //가로        무조건 시작은 = 1  끝은 num. 
				System.out.print(y);				
			}
			System.out.println(x);			
		}
			
	
		
		
		
		sc.close();
		

	}

}

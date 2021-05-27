package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		
		for(int i = 1; i<5; i++) {      // i=1, 2, 3, 4까지. 세로로 1, 2, 3, 4찍음.
			System.out.println(i);
		}

		System.out.println("======================");
		
		for(int i=10; i>0; i=i-2) {  // i값은 10. i가 0보다 커야하고 i의 값은 i-2이기 때문에
									 // 최초에 10 찍히고 그후 -2씩해서 10, 8, 6, 4, 2까지만 세로로 찍힘.
			System.out.println(i);
		}
	}

}

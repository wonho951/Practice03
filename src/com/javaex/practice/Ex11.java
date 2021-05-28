package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");	//숫자를 입력받아.	
		int num = sc.nextInt();   //숫자 입력해.
		
		int sum = 0;  //sum이라는 변수를 선언.얘는 결과값.
		
		for(int i = 1; i <= num; i++) {   // i의 초기값 = 1   조건은 초기값 <= 입력받은 값  1은 +1씩 증가 
			
			if(num%2 == 0 && i%2 == 0) {     // 만약 - 입력받은 값(1) 을 2로 나눴을때 나머지는 0이면서  f 
											 // i를 2로 나눴을 때 나머지가 0 이라면 
				sum = sum + i;               // 결과값은 0+i 
				
			} else if(num%2 == 1 && i%2 == 1) {  // 만약 - 입력받은 값(3)이 2로 나눴을때 나머지는 1이면서 
												 // i의 값을 2로 나눴을때 나머지가 1이면
				sum = sum + i;                   // sum은 0 +1 홀수 t
				
			}
		}		
		
		System.out.println("결과값 : " + sum);  //최종적으로 실행된 sum값이 출력.
		
		
		sc.close();

		
		
		
	}

}

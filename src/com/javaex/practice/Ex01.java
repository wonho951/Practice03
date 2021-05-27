package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		// index의 초기값이 0이고, index가 3보다 작은것이 조건이고, index++로 +1씩 증가시켰기 때문에 출력은 index=1 부터 index=2까지 출력된다.
		System.out.println("While문");
		int index = 0;
		while( index < 3) {
			System.out.println("index=" + index);
			index++;
		}    
		
		
		//index와 마찬가지로 초기값이 0이고 조건은 3보다 작은 경우를 줬고, order++로 +1씩 증가시켰기 때문에 출력값은 index와 같이 order=1부터 order=2까지 출력된다.
		System.out.println("for문");
		for(int order=0; order<3; order++) {
			System.out.println("order=" + order);
		}

	}

}

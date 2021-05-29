package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		
		int x  ;
		int y  ;
		
		for (y = 1; y<=10; y++) {            //세로 1증가해야됨.  
			
			for(x = 0; x < 10 ; x++) {      //가로 1증가해야됨.
				
				System.out.print(y+x + "	");
				
			}
			System.out.println(""); //다른값을 찍을 필요가 없음. 줄바꿈의 용도. 다른값 넣으면 마지막에 더 출력됨.
			
			
		}

	}

}

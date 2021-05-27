package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int x,y;
		for(x=0; x<4; x++) {   // 세로축. 초기값 0, x가 4보다 작아야 하고, 반복시 x의 값이 
			                   // +1씩 증가. 마지막에 공백출력이니까 있어도 안찍힘.
			                   // 세로로 4번 반복적으로 공백을 찍는다.(단, 출력시에 공백이므로 눈에 안보임)
			
			for(y=2; y>=0; y--) {        // 가로축. y초기값 2, y가 0보다 크거나 같고, 반복시
										 // y값이 감소. 2 , 1, 0 에서 *찍힘. 반복되므로 *3개 찍힘.
				                         // print이기때문에 다음줄 넘어가지않아 반복시 *3개 찍히고
				                         // 조건 만족시 다시 x값으로 넘어가기 때문에 그때 줄바뀜.
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}

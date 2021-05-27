package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		
		int x,y;
		for(x=0; x<4; x++) {            // 큰 톱니바퀴라고 생각. 세로로 반복적으로 찍는것. 
			                            //x의 초기값이 0이고 4보다 작고 반복할 때마다 +1씩
										// 증가시키기 때문에 세로로 4번 반복함.(단, 출력시에 공백이므로 눈에 안보임)
			
			for(y=0; y<2; y++) {        // 작은 톱니바퀴라고 생각. 가로로 반복적으로 찍는것.
										// y의 초기값이 0이고 y의 값이 2보다 작고 반복할때마다
				 						// y+1찍음. y값이 0과 1일때 찍히고 2에서는 
										// 안찍히기 때문에 가로로 * 두개 찍음.
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}

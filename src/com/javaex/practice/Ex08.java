package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		int i;
		int dan;
		
		for(i = 1; i <= 9; i++) {                  //세로 dan i
			for(dan = 2; dan < 9; dan++) {                   //// 가로 i dan
				System.out.print(dan + "*" + i + "=" + dan*i + "	");
			}
			System.out.println( "");//dan + "*" + i + "=" + dan*i
		}
	}

}

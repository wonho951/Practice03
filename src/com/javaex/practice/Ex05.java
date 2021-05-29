package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		
		int i = 1;					// i값이 1이기 때문에 1부터 5까지 세로로 반복적으로 찍힘. 
									// false가 break역할? 사실 설명하실때 제대로 못들었는데 while문이랑 같다고 생각해서 품.
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {
				flag = false;
			}
			System.out.println(i);
			i=i+1;
		}

	}

}

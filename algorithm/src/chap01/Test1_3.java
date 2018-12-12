/**
 * 날짜 : 2018-12-11
 * 
 * 페이지 : p22
 */
package chap01;

import java.util.Scanner;

public class Test1_3 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int n=stdIn.nextInt();
		
		if(n>0)
			System.out.println("양수");
		else if(n<0)
			System.out.println("음수");
		else 
			System.out.println("0");
	}

}

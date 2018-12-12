/**
 * 날짜 : 2018-12-11
 * 
 * 페이지 : p33
 */

package chap01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("a : ");
		int a=stdIn.nextInt();

		int b;
		do {
			System.out.println("b : ");
			b=stdIn.nextInt();
			if(b<=a) System.out.println("a보다 큰 값을 입력하세요");			
		}while(b<=a);
/*		답	
  		while (true) {
			System.out.print("b의 값：");
			b = stdIn.nextInt();
			if (b > a)
				break;
			System.out.println("a보다 큰 값을 입력하세요!");
		}
 		*/
				
		System.out.println("b-a : "+(b-a));

	}

}

/**
 * 날짜 : 2018-12-11
 * 
 * 페이지 : p38
 */
package chap01;

import java.util.Scanner;

public class Test1_8 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n;
		do {
			System.out.println("단 수 : ");
			n=stdIn.nextInt();
		}while(n<1);
			
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++)
				System.out.print("*");
			System.out.println();
		}
	}

}

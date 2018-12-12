/**
 * 날짜 : 2018-12-11
 * 
 * 페이지 : p33
 */
package chap01;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do
		{
			System.out.println("n : ");
			n=stdIn.nextInt();
		}while(n<0);
		
		int i=1; //자릿수
		int k=10;
		double check;
		while(true)
		{
			check=(double)n/k;
			if(check<1)break;
			i++;
			k=k*10;
		}
		System.out.println(n+"는 "+i+"자리입니다.");
		
/*		int no = 0; 			// 자릿수
		while (n > 0) {
			n /= 10; 			// n을 10으로 나눔
			no++;
		}*/


	}

}

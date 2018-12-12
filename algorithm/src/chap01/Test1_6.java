/**
 * 날짜 : 2018-12-11
 * 
 * 페이지 : p32
 * 
 * do문 while(제어식) => 한 번 실행한 다음에 계속 반복할 것 인지 판단 => 사후반복문
 */
package chap01;

import java.util.Scanner;

public class Test1_6 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n;
		System.out.println("1부터 n까지의 합을 구하기");
		
		do {
			System.out.println("n의 값 : ");
			n=stdIn.nextInt();
		}while(n<=0);
			
		int sum =0;
		for(int i=0;i<=n; i++)
			sum+=i;
		System.out.println("합 : "+sum);
	}
}

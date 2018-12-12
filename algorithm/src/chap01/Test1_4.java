/**
 * 날짜 : 2018-12-11
 * 
 * 페이지 : p27, p29
 * 
 * 반복구조(루프) : 어떤 조건이 성립하는 동안 처리를 반복하여 실행하는 것
 * 
 * while(제어식)명령문 => 사전 판단 반복 구조
 * for(초기화 부분; 제어식; 업데이트 부분)명령문
 * 
 */
package chap01;

import java.util.Scanner;

public class Test1_4 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);		
		System.out.println("1-n까지의 합");
		System.out.println("n : ");		
		int n =stdIn.nextInt();		
		int sum=0;
		
		
		int i=1;
		while(i<=n)
		{
			sum+=i;
			i++;
		}
		/*
		 * for(int i=1;i<=n;i++)
		 * sum+=i;
		 */
		// while문의 i=n+1이고 for문의 i=n이다.
		
		System.out.println("1-"+n+"까지의 합 : "+sum);
	}
}

/**
 * 날짜 : 2018-12-14
 * 
 * 페이지 : p83
 */

package chap02;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int retry;
		
		System.out.println("그 해 경과 일수를 구합니다.");
		
		do {
			System.out.print("년 : "); int year=stdIn.nextInt(); // 년
			System.out.print("월 : "); int month=stdIn.nextInt(); // 월
			System.out.print("일 : "); int day=stdIn.nextInt(); // 일
			
			System.out.printf("그 해 %d일째입니다.\n",dayOfYear(year,month,day));
			
			System.out.print("한 번 더 할까요? (1.예/0.아니오) : ");
			retry=stdIn.nextInt();
		}while(retry==1);
	}
	static int[][] mdays= {
			{31,28,31,30,31,30,31,31,30,31,30,31},	// 평년
			{31,29,31,30,31,30,31,31,30,31,30,31}	// 윤년
	};
	
	static int isLeap(int year) {	// 윤년 : 1	평년 : 0
		return (year%4==0 && year%100 !=0 || year %400==0)? 1:0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		while ((m-2)>=0) { // 1월에서 (m-1)월의 일 수를 더 함
			d += mdays[isLeap(y)][m-2];
			m--;
		}
		return d;
	}
/*	static int dayOfYear(int y, int m, int d) {
		while (--m != 0)
			d += mdays[isLeap(y)][m - 1];
		return (d);
	}*/

}

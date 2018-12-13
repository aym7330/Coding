/**
 * 날짜 : 2018-12-13
 * 
 * 페이지 : p67, p69
 * 
 * 16진수 0,1,2, ...,9,A,B,C,D,E,F
 * 
 * 0x1C : 16진수
 * 034 : 8진수
 * 
 * String 클래스 (기본형 X)
 * : 문자열을 넣어두기 위한 문자배열, 문자 수를 나타내는 필드 등을 갖고 있는 클래스
 * : 필드, 생성자, 메서드 등이 있음
 * 
 * char charAt(int i)		인덱수가 i인 곳의 문자를 가져 옴
 * int length()				문자열의 문자 수를 가져 옴
 * boolean equals(String s)	문자 열 s와 같은가를 조사
 * 
 */

package chap02;

import java.util.Scanner;

public class Test2_8AB {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int no;						// 변환하는 정수
		int cd;						// 기수
		int dno;					// 변환 후의 자릿수
		int retry;					// 다시 한법?
		char[] cno=new char[32]; 	// 변환 후 각 자리의 숫자를 넣어두는 문자의 배열
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.println("변환하는 음이 아닌 정수 : ");
				no=stdIn.nextInt();
			}while(no<0);
			
			do {
				System.out.println("어떤 진수로 변환할까요? (2~36) : ");
				cd=stdIn.nextInt();
			}while(cd<2||cd>36);
			
			dno=cardConvR(no, cd, cno);		// no를 cd진수로 변환
			
			System.out.print(cd+"진수로는 ");
			for(int i=dno-1;i>=0;i--) {		//윗자리부터 차례로 나타냄
				System.out.print(cno[i]);
			}
			System.out.println("입니다.");
			
			System.out.print("한 번 더 할까요?(1.예/0.아니오) : ");
			retry=stdIn.nextInt();
		}while(retry==1);
	}
	
	static int cardConvR(int x, int r, char[] d) {
		int digits=0;
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++]=dchar.charAt(x%r); //digits++ 대입하고 증가
			x/=r;
		}while(x!=0);
		return digits;
	}

}

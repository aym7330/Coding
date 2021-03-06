/**
 * 날짜 : 2018-12-18
 * 
 * 페이지 : p102
 * 
 * 선형 검색 
 * : 요소가 직선 모양으로 늘어선 배열에서의 검색
 * : 원하는 키 값을 갖는 요소를 만날 때까지 맨 앞부터 순서대로 요소를 검색
 * 종료 조건 
 * 1. 검색할 값을 발견하지 못하고 배열의 끝을 지나간 경우 => 검색 실패
 * 2. 검색할 값과 같은 요소를 발견한 경우 => 검색 성공
 * 
 * seqSearch : 배열 a의 처음부터 끝까지 n개의 요소를 대상으로 
 * 				값이 key인 요소를 선형 검색하고 검색한 요소의 인덱스를 반환
 * 값이 key인 요소가 여러개 존재할 경우 : 처음 발견한 요소가 인덱스
 * 값이 key인 요소가 존재하지 않는 경우 : -1반환
 */


package chap03;

import java.util.Scanner;

public class Test3_1 {
	static int seqSearch(int[] a, int n, int key) {
		int i=0;
		while(true) {
			if(i==n)
				return -1;	// 검색 실패(-1을 반환)
			if(a[i]==key)
				return i;	// 검색 성공(인덱스를 반환)
			i++;
		}
	}
	public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num=stdIn.nextInt();
		int[] x=new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.println("x["+i+"] :");
			x[i]=stdIn.nextInt();
		}
		
		System.out.println("검색할 값 : ");
		int ky=stdIn.nextInt();
		
		int idx=seqSearch(x, num, ky);	//배열 x에서 키 값이 ky인 요소를 검색
		
		if(idx==-1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
		}
}

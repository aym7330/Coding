/**
 * 날짜 : 2018-12-19
 * 
 * 페이지 : p111
 * 
 * 이진검색 : 오름차순 또는 내림차순으로 정렬된 배열에서 검색하는 알고리즘
 * 		 : 중앙값을 보고 검색 범위를 줄어나감
 * 		=> 선형검색보다 속도가 빠름
 * 					초기화
 * pl : 맨 앞의 인덱스	0
 * pr : 맨 끝의 인덱스	n-1
 * pc : 중앙 인덱스		(n-1)/2
 * 
 * a[pc]<key : a[pc+1]~a[pr] => pl=pc+1로 업데이트
 * a[pc]>key : a[pl]~a[pc-1] => pr=pc-1로 업데이트
 * 
 * 종료 조건 
 * 1. a[pc]와 key가 일치하는 경우
 * 2. 검색 범위가 더 이상 없는 경우
 * 
 * 검색에 필요한 비교 횟수의 평균값 : log n
 * => 검색을 반복할 때마다 검색 범위가 절반이 임
 * 검색에 실패한 경우 : ┌log(n+1)┐
 * => ┌x┐ : 천장 메서드로, x보다 크거나 같으면서 가장 작은 정수
 * 검색에 성공한 경우 : 대략 log n - 1
 */

package chap03;

import java.util.Scanner;

public class Test3_4 {

	static int binSearch(int[] a, int n, int key) {
		int pl=0;
		int pr=n-1;
		
		do {
			int pc=(pl+pr)/2;
			if(a[pc]==key)
				return pc;		// 검색 성공
			else if(a[pc]<key)	//검색 범위를 뒤쪽 절반으로
				pl=pc+1;
			else
				pr=pc-1;		//검색 범위를 앞쪽 절반으로
		}while(pl<=pr);
		return -1;				// 검색 실패
	}
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num=stdIn.nextInt();
		int[] x=new int[num];
		
		System.out.println("오름차순으로 입력하세요");
		
		System.out.println("x[0] :");
		x[0]=stdIn.nextInt();
		
		for(int i=1; i<num;i++) {
			do {
				System.out.println("x["+i+"] : ");
				x[i]=stdIn.nextInt();
			}while(x[i]<x[i-1]);	// 바로 앞의 요소보다 작으면 다시 입력
		}
		
		System.out.println("검색할 값 : ");
		int ky=stdIn.nextInt();
		
		int idx=binSearch(x, num, ky);
		
		if(idx==-1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
	}
}

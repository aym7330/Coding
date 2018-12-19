/**
 * 날짜 : 2018-12-19
 * 
 * 페이지 : p105
 * 
 * 종료 조건 
 * 1. 검색할 값을 발견하지 못하고 배열의 끝을 지나간 경우 => 검색 실패
 * 2. 검색할 값과 같은 요소를 발견한 경우 => 검색 성공
 * 
 * 보초법 : 선형 검색의 종료 조건을 검사하는 비용을 반으로 줄이는 방법
 * 보초 : 검색하기 전에 검색하고자 하는 키 값을 맨 끝 요소에 저장, 이 때 저장하는 값을 보초라고 한다.
 * 		=> 종료 조건1를 수행하지 않아도 된다.
 */
package chap03;

import java.util.Scanner;

public class Test3_3 {
	static int seqSearchSen(int[] a, int n, int key) {
		int i=0;
		a[n]=key;			//보초를 추가
		while(true) {
			if(a[i]==key)
				break;
			i++;
		}
		return i==n?-1:i;
	}
	public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num=stdIn.nextInt();
		int[] x=new int[num+1];		//요솟수 num+1
		
		for(int i=0;i<num;i++) {
			System.out.println("x["+i+"] :");
			x[i]=stdIn.nextInt();
		}
		
		System.out.println("검색할 값 : ");
		int ky=stdIn.nextInt();
		
		int idx=seqSearchSen(x, num, ky);	//배열 x에서 키 값이 ky인 요소를 검색
		
		if(idx==-1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
		}
}

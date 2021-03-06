/**
 * 날짜 : 2018-12-23
 * 
 * 페이지 : p120
 * 
 * binarySearch 메서드
 * 장점1 : 이진 검색 메서드를 직접 코딩할 필요가 없다.
 * 장점2 : 모든 자료형 배열에서 검색할 수 있다.
 * 검색에 성공한 경우  : key와 일치하는 요소의 인덱스를 반환, 일치하는 요소가 여러개 있다면 무작위의 인덱스를 반환
 * 검색에 실패한 경우 : 반환값은 삽입 포인트를 x라고 할 떄 -x-1을 반환, 삽입포인트는 검색하기 위해 지정한 key보다 큰요소 중 첫번째 요소의 인덱스
 */
package chap03;

import java.util.*;

public class Test3_5 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num=stdIn.nextInt();
		int[] x=new int[num];
		
		System.out.println("오름차순으로 입력하세요");
		
		System.out.println("x[0] : ");
		x[0]=stdIn.nextInt();
		
		for(int i=1;i<num;i++) {
			do {
				System.out.println("x["+i+"] : ");
				x[i]=stdIn.nextInt();
			}while(x[i]<x[i-1]);
		}
		
		System.out.print("검색할 값 : ");
		int ky=stdIn.nextInt();
		
		int idx=Arrays.binarySearch(x, ky);
		
		if(idx==-1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
	}

}

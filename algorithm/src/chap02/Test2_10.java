/**
 * 날짜 : 2018-12-13
 * 
 * 페이지 : p75
 * 
 * Test2_9 알고리즘 개선 : 2부터 n-1까지의 어떤 소수로도 나누어떨어지지 않는다.
 * 나눗셈을 수행한 횟수 : 14622
 * 
 * => 같은 답을 얻는 알고리즘은 하나가 아니다
 * => 빠른 알고리즘은 메모리를 많이 요구한다.
 */

package chap02;

public class Test2_10 {

	public static void main(String[] args) {
		int counter=0;				// 나눗셈의 횟수
		int ptr=0;					// 찾은 소수의 개수
		int[] prime =new int[500];	// 소수를 저장하는 배열
		prime[ptr++]=2;		
		
		for(int n=3;n<=1000;n+=2) {	// 홀수만
			int i;
			for(i=1;i<ptr;i++) {	// 이미 찾은 소수로 나누어 봄
				counter++;
				if(n%prime[i]==0)
					break;
			}
			if(ptr == i)			// 마지막까지 나누어떨어지지 않음
				prime[ptr++]=n;		//소수라고 배열에 저장
		}
		
		for(int i=0;i<ptr;i++) {	
			System.out.println(prime[i]);
		}
		System.out.println("나눗셈을 수행한 횟수 : "+counter);
	}

}

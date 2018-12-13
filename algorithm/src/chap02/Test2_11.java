/**
 * 날짜 : 2018-12-13
 * 
 * 페이지 : p78
 * 
 * 곱셈과 나눗셈을 수행한 횟수 : 3774
 */

package chap02;

public class Test2_11 {

	public static void main(String[] args) {
		int counter=0;				// 나눗셈의 횟수
		int ptr=0;					// 찾은 소수의 개수
		int[] prime =new int[500];	// 소수를 저장하는 배열
		prime[ptr++]=2;		
		prime[ptr++]=3;	
		
		for(int n=5;n<=1000;n+=2) {	// 홀수만
			boolean flag=false;
			for(int i=1;prime[i]*prime[i]<=n;i++) {	// 이미 찾은 소수로 나누어 봄
				counter+=2;							// prime[i]*prime[i], n%prime[i]
				if(n%prime[i]==0) {
					flag=true;
					break;
			}

		}
		
			if(!flag) {
				prime[ptr++]=n;
				counter++;	// prime[i]*prime[i]<=n 성립하지 않을 경우에 그 곱셈이 수행횟수에 포함되지 않음
			}
		}
		for(int i=0;i<ptr;i++) 
			System.out.println(prime[i]);
		
		System.out.println("곱셈과 나눗셈을 수행한 횟수 : "+counter);
		}
	}



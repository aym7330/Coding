/**
 * 날짜 : 2018-12-13
 * 
 * 페이지 : p72
 * 
 * 나눗셈을 수행한 횟수 : 78022
 */

package chap02;

public class Test2_9 {
	public static void main(String[] args) {
		int counter=0;
		
		for(int n=2;n<=1000;n++) {
			int i;
			for(i=2;i<n;i++) {
				counter++;
				if(n%i==0)
					break;
			}
			if(n==i)
				System.out.println(n);	//소수인 경우 for문이 끝까지 실행 됨
		}
		
		System.out.println("나눗셈을 수행한 횟수 : "+counter);
	}
}	

/**
 * 날짜 : 2018-12-12
 * 
 * 페이지 : p62
 */

package chap02;
public class Test2_7 {

	public static void main(String[] args) {
		Object cls=new Q3();	//입력메서드 가져오기
		System.out.print("a의 ");
		int[] a=Q3.input();

		System.out.print("b의 ");
		int[] b=Q3.input();
		
		System.out.println("배열 a와 b는 "+(equals(a,b)?"같습니다.":"같지 않습니다."));
	}
	
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length)
			return false;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i])
				return false;
		}
		return true;
	}

}

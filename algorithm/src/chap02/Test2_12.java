/**
 * 날짜 : 2018-12-14
 * 
 * 페이지 : p80
 * 
 * 다차원 배열 
 * : 엄밀하게 말하면 java는 다차원배열이 없다. 
 * : 'int형을 구성 자료형으로 하는 배열'을 구성 자료형으로 하는 배열
 * :  int[][] x =new int[2][4];
 */
package chap02;

public class Test2_12 {

	public static void main(String[] args) {
		int[][] x=new int[2][4];
		
		x[0][1]=37;
		x[0][3]=54;
		x[1][2]=65;
		
		for(int i=0;i<2;i++)
			for(int j=0;j<4;j++) {
				System.out.println("x["+i+"]["+j+"] = "+x[i][j]);
			}

	}

}

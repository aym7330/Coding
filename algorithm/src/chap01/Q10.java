/**
 * ��¥ : 2018-12-11
 * 
 * ������ : p33
 */

package chap01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("a : ");
		int a=stdIn.nextInt();

		int b;
		do {
			System.out.println("b : ");
			b=stdIn.nextInt();
			if(b<=a) System.out.println("a���� ū ���� �Է��ϼ���");			
		}while(b<=a);
/*		��	
  		while (true) {
			System.out.print("b�� ����");
			b = stdIn.nextInt();
			if (b > a)
				break;
			System.out.println("a���� ū ���� �Է��ϼ���!");
		}
 		*/
				
		System.out.println("b-a : "+(b-a));

	}

}

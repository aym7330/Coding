/**
 * ��¥ : 2018-12-11
 * 
 * ������ : p21
 */

package chap01;
import java.util.Scanner;

public class Test1C_1 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("a : ");int a=stdIn.nextInt();
		System.out.println("b : ");int b=stdIn.nextInt();
		System.out.println("c : ");int c=stdIn.nextInt();
		
		System.out.println("�߾Ӱ� : "+med3(a,b,c));
	}
	static int med3(int a, int b, int c) //�߾Ӱ� ���ϱ�
	{
		if(a>=b)
			if(b>=c) return b;
			else if(a<=c) return a;
			else return c;
		else if (a>c) return a;
		else if(b>c) return c;
		else return b;
	}

}

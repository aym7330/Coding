/**
 * ��¥ : 2018-12-11
 * 
 * ������ : p13
 * 
 * ������ ���� : ���� ����(���μ���)�� ���������� ����Ǵ� ���� 
 * ���ñ��� : ����� ���� ���α׷��� ���� �帧�� �����ϴ� ����
 * 
 * next() : ���ڿ�(�����̽�, �ٹٲ� ���ڷ� ����)
 * nextLine() : ���ڿ� 1��
 * 
 * �˰��� : ������ �ذ��ϱ� ���� �Ž���, ��Ȯ�ϰ� ���ǵǰ� ������ �ִ� ���� ���� �������� �̷���� ����
 * 
 */
package chap01;
import java.util.*;
class Test1_1 {
	public static void main(String[] args) {
		Scanner stdIn= new Scanner(System.in); // System.in Ű����� ����� ǥ�� �Է� ��Ʈ��
		System.out.println("�� ������ �ִ��� ���մϴ�.");
		System.out.println("a : "); int a= stdIn.nextInt(); // stdIn.nextInt() Ű����� ������ �Է�
		System.out.println("b : "); int b= stdIn.nextInt(); // stdIn�� ǥ�� �Է� ��Ʈ������ ���ڿ� ���ڸ� ������ ��ġ ������ ��
		System.out.println("c : "); int c= stdIn.nextInt();
		
		int max= a;
		if(b>max)max=b;
		if(c>max)max=c;
		
		System.out.println("�ִ��� "+max+"�Դϴ�.");
		System.out.println("-------------------------------------");
		System.out.println("max3(3,2,1)= "+max3(3,2,1));
	}
	
	static int max3(int a, int b, int c) { // �Ű����� : �޼��带 ������ �� �޼��忡 ���޵Ǵ� ���� �����ϱ� ���� ����
		int max=a;
		if(b>max)max=b;
		if(c>max)max=c;
		
		return max;
	}
}



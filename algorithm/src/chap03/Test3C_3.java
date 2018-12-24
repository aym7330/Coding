/**
 * ��¥ : 2018-12-24
 * 
 * ������ : p129
 * 
 * ���׸� : ó���ؾ� �� ����� �ڷ����� �������� �ʴ� Ŭ����(�������̽�) ���� ��� <Type>
 * �Ķ���� �̸��� �ۼ��ϴ� ��� : 
 * 1. 1���� �빮�ڸ� ���
 * 2. �÷����� �ڷ����� element�� �ձ����� E�� ���
 * 3. map�� Ű, ���� key�� value�� �ձ����� K�� V�� ���
 * 4. �Ϲ������δ� T�� ���
 * 
 * ���������� ���ϵ� ī�带 �����ϴ� �͵� ����
 * <? extends T> : Ŭ���� T�� ���� Ŭ������ ����
 * <? super T> : Ŭ���� T�� ���� Ŭ������ ����
 */

package chap03;

public class Test3C_3 {
	static class GenericClass<T>{
		private T xyz;
		GenericClass(T t){	//������
			this.xyz=t;
		}
		T getXyz() {		//xyz�� ��ȯ
			return xyz;	
		}
		
		public static void main(String[] args) {
			GenericClass<String> s=new GenericClass<String>("ABC");
			GenericClass<Integer> n=new GenericClass<Integer>(15);
			
			System.out.println(s.getXyz());
			System.out.println(n.getXyz());
			
		}
	}
}

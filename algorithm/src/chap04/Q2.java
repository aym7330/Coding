/**
 * ��¥ : 2018-12-28
 * 
 * ������ : p144
 */
package chap04;

import chap04.Q2.EmptyIntStackException;
import chap04.Q2.OverflowIntStackException;

public class Q2<E> {
		private int max;
		private int ptr;
		private E[] stk;
		

		// ���� �� ���� : ������ ��� ����
		public static class EmptyIntStackException extends RuntimeException{
			public EmptyIntStackException() {}
		}
		
		// ���� �� ���� : ������ ���� ��
		public static class OverflowIntStackException extends RuntimeException{
			public OverflowIntStackException() {}
		}
		
		// ������ : ���� ��ü�� �迭�� �����ϴ� �� �غ��۾��� ����
		public Q2(int capacity) {
			ptr=0;
			max=capacity;
			try {
				stk= (E[])new Object[max];			// ���� ��ü�� �迭 ����
			}catch (OutOfMemoryError e) {	// ������ �� ����
				max=0;
			}
		}
		
		// ���ÿ� x�� Ǫ��
		public E push(E x) throws OverflowIntStackException{
			if(ptr>=max)	//������ ���� ��
				throw new OverflowIntStackException();
			return stk[ptr++]=x;
		}
		
		// ���ÿ��� �����͸� ��(���� �ִ� �����͸� ����)
		public E pop() throws EmptyIntStackException{
			if(ptr<=0)
				throw new EmptyIntStackException();
			return stk[--ptr];
		}
		
		//���ÿ��� �����͸� ��ũ(���� �ִ� �����͸� �鿩�� ��)
		public E peek() throws EmptyIntStackException{
			if(ptr<=0)
				throw new EmptyIntStackException();
			return stk[ptr-1];
		}
		
		// ���ÿ��� x�� ã�� �ε���(������ -1)�� ��ȯ
		public int indexOf(E x) {
			for(int i=ptr-1;i>=0;i--)	// ���� �ʿ��� ���� �˻�
				if(stk[i]==x)
					return i;
			return -1;
		}
		
		// ������ ���
		public void clear() {
			ptr=0;
		}
		
		// ������ �뷮�� ��ȯ
		public int capacity() {
			return max;
		}
		
		// ���ÿ� �׿� �ִ� ������ ���� ��ȯ
		public int size() {
			return ptr;
		}
		
		// ������ ��� �ִ°�?
		public boolean isEmpty() {
			return ptr<=0;
		}
		
		// ������ ���� á�°�?
		public boolean isFull() {
			return ptr>=max;
		}
		
		// ���� ���� ��� �����͸� �ٴ� -> ����� ������ ���
		public void dump() {
			if(ptr<=0)
				System.out.println("������ ��� �ֽ��ϴ�.");
			else {
				for(int i=0;i<ptr;i++)
					System.out.print(stk[i]+" ");
				System.out.println();
			}
		}
		
	}


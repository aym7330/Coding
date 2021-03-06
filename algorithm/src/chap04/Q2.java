/**
 * 날짜 : 2018-12-28
 * 
 * 페이지 : p144
 */
package chap04;

import chap04.Q2.EmptyIntStackException;
import chap04.Q2.OverflowIntStackException;

public class Q2<E> {
		private int max;
		private int ptr;
		private E[] stk;
		

		// 실행 시 예외 : 스택이 비어 있음
		public static class EmptyIntStackException extends RuntimeException{
			public EmptyIntStackException() {}
		}
		
		// 실행 시 예외 : 스택이 가득 참
		public static class OverflowIntStackException extends RuntimeException{
			public OverflowIntStackException() {}
		}
		
		// 생성자 : 스택 본체용 배열을 생성하는 등 준비작업을 수행
		public Q2(int capacity) {
			ptr=0;
			max=capacity;
			try {
				stk= (E[])new Object[max];			// 스택 본체용 배열 생성
			}catch (OutOfMemoryError e) {	// 생성할 수 없음
				max=0;
			}
		}
		
		// 스택에 x를 푸시
		public E push(E x) throws OverflowIntStackException{
			if(ptr>=max)	//스택이 가득 참
				throw new OverflowIntStackException();
			return stk[ptr++]=x;
		}
		
		// 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
		public E pop() throws EmptyIntStackException{
			if(ptr<=0)
				throw new EmptyIntStackException();
			return stk[--ptr];
		}
		
		//스택에서 데이터를 피크(정상에 있는 데이터를 들여다 봄)
		public E peek() throws EmptyIntStackException{
			if(ptr<=0)
				throw new EmptyIntStackException();
			return stk[ptr-1];
		}
		
		// 스택에서 x를 찾아 인덱스(없으면 -1)를 반환
		public int indexOf(E x) {
			for(int i=ptr-1;i>=0;i--)	// 정상 쪽에서 선형 검색
				if(stk[i]==x)
					return i;
			return -1;
		}
		
		// 스택을 비움
		public void clear() {
			ptr=0;
		}
		
		// 스택의 용량을 반환
		public int capacity() {
			return max;
		}
		
		// 스택에 쌓여 있는 데이터 수를 반환
		public int size() {
			return ptr;
		}
		
		// 스택이 비어 있는가?
		public boolean isEmpty() {
			return ptr<=0;
		}
		
		// 스택이 가득 찼는가?
		public boolean isFull() {
			return ptr>=max;
		}
		
		// 스택 안의 모든 데이터를 바닥 -> 꼬대기 순서로 출력
		public void dump() {
			if(ptr<=0)
				System.out.println("스택이 비어 있습니다.");
			else {
				for(int i=0;i<ptr;i++)
					System.out.print(stk[i]+" ");
				System.out.println();
			}
		}
		
	}


/**
 * 날짜 : 2018-12-24
 * 
 * 페이지 : p129
 * 
 * 제네릭 : 처리해야 할 대상의 자료형에 의존하지 않는 클래스(인터페이스) 구현 방식 <Type>
 * 파라미터 이름을 작성하는 방법 : 
 * 1. 1개의 대문자를 사용
 * 2. 컬렉션의 자료형은 element의 앞글자인 E를 사용
 * 3. map의 키, 값은 key와 value의 앞글자인 K와 V를 사용
 * 4. 일반적으로는 T를 사용
 * 
 * 형변수에는 와일드 카드를 지정하는 것도 가능
 * <? extends T> : 클래스 T의 서브 클래스를 전달
 * <? super T> : 클래스 T의 슈퍼 클래스를 전달
 */

package chap03;

public class Test3C_3 {
	static class GenericClass<T>{
		private T xyz;
		GenericClass(T t){	//생성자
			this.xyz=t;
		}
		T getXyz() {		//xyz를 반환
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

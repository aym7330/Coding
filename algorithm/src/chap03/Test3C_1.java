/**
 * 날짜 : 2018-12-24
 * 
 * 페이지 : p121
 * 
 * 1. 인스턴스 메서드(비정적 메서드) => static X
 * 인스턴스 메서드 호출 시 : 클래스형 변수 이름.메서드 이름 a.getId()
 * 2. 클래스 메서드(정적 메서드) => static O
 * 클래스 메서드 호출 시 : 클래스 이름.메서드 이름 Id.getCounter()
 *  
 */
package chap03;

class Id {
	private static int counter = 0; // 아이디를 몇 개 부여했는지 저장
	private int id; // 아이디

	// 생성자
	public Id() {
		id = ++counter;
	}

	// 아이디를 반환하는 인스턴스 메서드
	public int getId() {
		return id;
	}

	// counter를 반환하는 메서드
	public static int getCounter() {
		return counter;
	}
}

public class Test3C_1 {
	public static void main(String[] args) {
		Id a=new Id();
		Id b=new Id();
		
		System.out.println("a의 아이디 : "+a.getId());
		System.out.println("b의 아이디 : "+b.getId());
		
		System.out.println("부여한 아이디의 개수 : "+Id.getCounter());
	}
}


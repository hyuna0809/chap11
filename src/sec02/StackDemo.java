package sec02;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		// List인터페이스의 구현클래스중 하나이다 Stack<E>로 선언되어 있다.
		// <E>를 타입파라미터를 구체적인타입 <String> 으로 지정 
		// 먼저입력나중출력 => FILO
		Stack<String> s1 = new Stack<>();

		s1.push("사과"); // push 추가메서드
		s1.push("바나나"); //
		s1.push("체리");

		System.out.println(s1);
		
		System.out.println(s1.peek());// 최상위 원소를 제거하지 않고 엿보기

		System.out.println(s1.pop()); // pop 내보내기 Stack 나중에 들어간것이 먼저 나온다.
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		
		System.out.println();

		Stack<Integer> s2 = new Stack<>(); // 구체적타입 Integer

		s2.add(10); // List 인터페이스는 Stack의 부모인터페이스이므로 부모가 가지고 있는 메서드 사용할 수 있다.
		s2.add(20);
		System.out.println(s2);
		s2.add(1, 100); // add(인덱스, 값)를 사용하면 인덱스에 값을 추가한다.

		for (int value : s2)
			System.out.print(value + " ");
		System.out.println();

		while (!s2.empty()) // 원소가 없냐가 아니냐
			System.out.print(s2.pop() + " ");
	}
}
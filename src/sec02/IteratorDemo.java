package sec02;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
    	// 자바가 제공하는 인터페이스 Collection<E> 선언
    	// 프로그램에 사용하려면 구체적인 타입을 지정 Collection<String>
    	// asList(E e) => 매개값으로 구체적으로 지정한 타입이 들어와야한다.
        Collection<String> list = Arrays.asList("다람쥐", "개구리","나비");
        // list는 데이터 "다람쥐","개구리","나비"
        // ite = list 옮기면서 반복자데이터형식을 사용했다.

        Iterator<String> ite = list.iterator();
        // 조건반복문 사용한다.
        while (ite.hasNext())// 조건식이메서드를 이용하여 .hasNext() 원소있는지(참) 없는지(거짓) 판단
            System.out.print(ite.next() + "-");// 참이면 .next() 메서드가 순서대로 데이터 내보낸다.
        System.out.println();
        
        // 앞에서 원소를 다 읽어서  .has next()가 거짓이다.
        while (ite.hasNext())
            System.out.print(ite.next() + "+");
        System.out.println();

        ite = list.iterator();
        while (ite.hasNext())
            System.out.print(ite.next() + "=");
    }
}
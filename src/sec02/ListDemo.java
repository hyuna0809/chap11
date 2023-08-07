package sec02;

import java.util.Arrays;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        String[] animals1 = { "사슴", "호랑이", "바다표범", "곰" };
        
        // 자바가 제공하는 API의 인터페이스 List<E> 선언했다.
        // List<Strin>라는 구체적인 타입을 지정한다. => 배열로 선언한 ani를 List 타입으로 변환
        List<String> animals2 = Arrays.asList(animals1);
        animals2.set(1, "푸바오");//set는 덮어쓰기
//        animals2.add("늑대");// ani는 크기가 4개로 정해진 String타입으로 만든 배열명

        for (String s : animals2)
            System.out.print(s + " ");
        System.out.println();

        animals2.sort((x, y) -> x.length() - y.length());// 람다식 => 함수를 축약한 것 sort메서드를 이용한 정렬한것으로 오름차순
        
        String[] animals3 = animals2.toArray(new String[0]);// List로 되어있는 ani2를 배열로 변환해서 animal3에 저장
        for (int i = 0; i < animals3.length; i++)
            System.out.print(animals3[i] + " ");
        System.out.println();
        
        for(String s2 : animals3) {
        	System.out.print(s2 + " ");
        }
        
        // List인터페이스로 값을 지정했다 값을 지정하기 위해 List.of()를 사용
        List<String> car = List.of("그랜저", "소나타", "아반테", "제네시스");
//        car.set(1, "싼타페");
        car.forEach(s -> System.out.print(s + " ")); // 람다식

//        List<Object> objects = List.of("a", null);
    }
}
package sec02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = List.of("그랜저", "소나타", "아반테", "제네시스", "소울");

        System.out.println(list.indexOf("소나타")); // 인덱스 1번 출력
        System.out.println(list.contains("싼타페"));// 싼타페없어서 false
        
        // List.of()메서드에 저장된 내용을 ArrayList로 동적배열로 지정
        List<String> cars1 = new ArrayList<>(list);
        cars1.add("싼타페"); // 추가 사용 add(싼타페)를 끝에 추가 "그랜저", "소나타", "아반테", "제네시스", "소울" , "싼타페"
        List<String> cars2 = new ArrayList<>(list);
        cars2.remove("제네시스"); // 삭제 remove("")를 삭제 "그랜저", "소나타", "아반테", "소울" , "싼타페"
        System.out.println(cars1.containsAll(cars2)); // cars1에 cars2가 모두 포함되는가? true
        System.out.println(cars2);
        
        cars1.removeIf(c -> c.startsWith("소")); // 시작되는 문자가 "소"인것을 삭제
        System.out.println("소자 삭제 cars1 = " + cars1);
        cars1.replaceAll(s -> "뉴" + s); // 앞글자 "뉴"를 삽입
        System.out.println("뉴를 삽입 cars1 = " + cars1);
        cars1.forEach(s -> System.out.print(s + " "));
        for(String s : cars1)
        	System.out.println(s+" ");
        System.out.println();
        
        cars1.clear(); // 모두지우기
        System.out.println("모두삭제 cars1 = " + cars1);
        // is~뒤에 붙는 명령어에 따라서 존재여부를 참과 거짓으로 반환한다.
        
        System.out.println(cars1.isEmpty());
    }
}
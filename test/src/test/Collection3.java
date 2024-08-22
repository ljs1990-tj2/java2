package test;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 홍길동, 30, 서울
		// 김철수, 20, 인천
		// 박영희, 25, 제주도
		Human hong = new Human("홍길동", 30, "서울");
		Human kim = new Human("김철수", 20, "인천");
		Human park = new Human("박영희", 25, "제주도");
		
		ArrayList<Human> hList =
				new ArrayList<>();
		hList.add(hong);	
		hList.add(kim);	
		hList.add(park);	
		
		
		// Test 클래스에 있는 callHuman 메소드 호출
		// 리턴으로는 hong, kim, park 3개의 객체를 받고 싶어
		// 그 결과를 ArrayList 에 저장
//		ArrayList<Human> list = Test.callHuman();
		
		
		// Test 클래스에 있는 callHuman 메소드 호출
		// 리턴으로는 문자열 "안녕하세요"
//		String qerqerqr = Test.callHuman();
		
		
		// Test 클래스에 있는 callHuman 메소드 호출
		// 리턴으로는 Human 클래스로 만든 객체 아무거나 
		// callHuman 메소드 호출 결과를 person 객체에 담고싶다
//		Human person = Test.callHuman();
		
		
//		int[] arr = Test.callArray();
//		// [1,3,5,7,9] 결과를 리턴 받기
//		System.out.println(Arrays.toString(arr)); // [1,3,5,7,9]
		
		// ArrayList<Integer> list = [1 ,3, 5 ,7]
		// int a = list.get(2);
		
		HashMap<String, Integer> map 
			= new HashMap<String, Integer>();
		
		map.put("num1", 100);
		map.put("num2", 3000);
		map.put("num3", 50);
		
		System.out.println(map);
		
	}
}

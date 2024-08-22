package test;

import java.util.ArrayList;

public class Collection5 {
	public static void main(String[] args) {
		Human hong = new Human("홍길동", 30, "서울");
		Human kim = new Human("김철수", 20, "인천");
		Human park = new Human("박영희", 25, "제주도");
		
		ArrayList<Human> hList =
				new ArrayList<>();
		hList.add(hong);	
		hList.add(kim);	
		hList.add(park);	
		
		Human human = Test.maxAge(hList);
		// human에 나이가 가장 많은 사람의 객체가 담기게 maxAge 구현
		
		
		
		
	}
}

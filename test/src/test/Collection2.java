package test;

import java.util.HashMap;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 홍길동, 30, 서울
		Human hong = new Human("홍길동", 30, "서울");
		
		HashMap<String, Object> map = Test.callPerson(hong);
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		System.out.println(map.get("addr"));
	
		// json 
		// [{}]
		
		
	}
}

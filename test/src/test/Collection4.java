package test;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection4 {
	public static void main(String[] args) {
		// {name : 홍길동, age : 30, addr : 서울}
		// 위 형태의 HashMap 객체를 1개 만드세요.
		ArrayList<HashMap<String, Object>> list
		= new ArrayList<HashMap<String, Object>>();
		
		HashMap<String, Object> hong
			= new HashMap<String, Object>();
		hong.put("name", "홍길동");
		hong.put("age", 30);
		hong.put("addr", "서울");
		list.add(hong);
		
		HashMap<String, Object> kim
			= new HashMap<String, Object>();
		kim.put("name", "김철수");
		kim.put("age", 20);
		kim.put("addr", "인천");
		list.add(kim);
		
		HashMap<String, Object> park
			= new HashMap<String, Object>();
		park.put("name", "박영희");
		park.put("age", 25);
		park.put("addr", "제주도");
		list.add(park);
		
		System.out.println(list);
		
		
		
		// list에서 나이가 25살 이상인 사람의 숫자를 구해서
		// int num에 담으세요.
		int count = 0;
		for(int i=0; i<list.size(); i++) {
			HashMap<String, Object> map = list.get(i);
			int age = (int) map.get("age");
			if(age >= 25) {
				count++;
			}
			
//			if((int)list.get(i).get("age") >= 25) {
//				count++;
//			}
			
		}
		System.out.println(count);
	}
}


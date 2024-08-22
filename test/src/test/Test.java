package test;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
	static ArrayList<Human> callHuman() {
		ArrayList<Human> list = new ArrayList<Human>();
		Human hong = new Human("홍길동", 30, "서울");
		Human kim = new Human("김철수", 20, "인천");
		Human park = new Human("박영희", 25, "제주도");
		list.add(hong);
		list.add(kim);
		list.add(park);
		
		return list;
	}
	
	static int[] callArray() {
		int[] arr = {1,3,5,7,9};
		return arr;
	}
	
	static HashMap<String, Object> callPerson(Human h){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("name", h.getName());
		map.put("age", h.getAge());
		map.put("addr", h.getAddr());
		
		return map;
	}
	
	static Human maxAge(ArrayList<Human> list) {
		int index = 0;
		for(int i=1; i<list.size(); i++) {
			if(list.get(index).getAge() < list.get(i).getAge()) {
				index = i;
			}
		}
		
		return list.get(index);
	}
	
	
}

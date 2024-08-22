package test;

import java.util.ArrayList;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 자바, 오라클, html, jsp
		ArrayList<String> strList 
			= new ArrayList<String>();
		strList.add("자바");
		strList.add("오라클");
		strList.add("html");
		strList.add("jsp");
		// [자바, 오라클, html, jsp]
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
				
		// 10, 30, 50, 100
		ArrayList<Integer> numList 
			= new ArrayList<>();
		
		numList.add(10);
		int b = numList.get(0);
		// 홍길동, 30
		
		ArrayList<Object> objList 
			= new ArrayList<Object>();
		objList.add("홍길동");
		objList.add(30);
		
		int a = (int) objList.get(1);
		
	}

}

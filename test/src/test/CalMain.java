package test;

import java.util.ArrayList;
import java.util.HashMap;

public class CalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// {num1 : 100, num2 : 20}
		HashMap<String, Integer> numMap = new HashMap<>();
		numMap.put("num1", 100);
		numMap.put("num2", 20);
		
		Calculator calc = new Calculator();
		// 인터페이스에 div 추상메소드 작성 후 오바리이딩해서 구현
		int result = calc.div(numMap); 
		System.out.println(result); // 5 출력
		
		
		ArrayList<Double> list = new ArrayList<>();
		list.add(100.5);
		list.add(11.3);
		
		// 인터페이스에 minus 추상메소드 작성 후 오바리이딩해서 구현
		double result2 = calc.minus(list);
		System.out.println(result2); // 89.2 출력
		
		
	}
}

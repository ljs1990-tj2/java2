package test;

import java.util.ArrayList;
import java.util.HashMap;

public interface CalculatorImpl {
	// 숫자 2개를 받아서 더해서 리턴해주는 추상메소드 작성
	// Calculator 클래스를 만들어서 해당 인터페이스 상속받아서 구현해라
	int sum(int x, int y);
	
	int mul(int x, int y);
	
	int div(HashMap<String, Integer> map);
	
	double minus(ArrayList<Double> list);
	
}

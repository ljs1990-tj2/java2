package test;

import java.util.ArrayList;
import java.util.HashMap;

public class Calculator implements CalculatorImpl {

	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int mul(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public int div(HashMap<String, Integer> map) {
		// TODO Auto-generated method stub
		int x = map.get("num1");
		int y = map.get("num2");
		return x / y;
	}

	@Override
	public double minus(ArrayList<Double> list) {
		// TODO Auto-generated method stub
		double x = list.get(0);
		double y = list.get(1);
		
		return x-y;
	}
}

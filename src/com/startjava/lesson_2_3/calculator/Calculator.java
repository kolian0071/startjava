package com.startjava.lesson_2_3.calculator;

public class Calculator {

	private String[] equation = new String[3];

	public void setEquation(String equation) {
		this.equation = equation.split(" ", 3);
	}

	public int calculate() {
		int result = 0;
		switch(equation[1].charAt(0)) {
			case '+':
				result = Math.addExact(Integer.parseInt(equation[0]), Integer.parseInt(equation[2]));
				break;
			case '-':
				result = Math.subtractExact(Integer.parseInt(equation[0]), Integer.parseInt(equation[2]));
				break;
			case '*':
				result = Math.multiplyExact(Integer.parseInt(equation[0]), Integer.parseInt(equation[2]));
				break;
			case '/':
				result = divide(Integer.parseInt(equation[0]), Integer.parseInt(equation[2]));
				break;
			case '^':
				result = (int) Math.pow(Integer.parseInt(equation[0]), Integer.parseInt(equation[2]));
				break;
			case '%':
				result = Math.floorMod(Integer.parseInt(equation[0]), Integer.parseInt(equation[2]));
				break;
		}
		return result;
	}

	public int divide(int firstNum, int secondNum) {
		return firstNum / secondNum;
	}
}
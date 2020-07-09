package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

	private String[] mathExpression = new String[3];

	public void setEquation(String equation) {
		this.mathExpression = equation.split(" ", 3);
	}

	public int calculate() {
		switch(mathExpression[1].charAt(0)) {
			case '+':
				return Math.addExact(Integer.parseInt(mathExpression[0]), Integer.parseInt(mathExpression[2]));
			case '-':
				return Math.subtractExact(Integer.parseInt(mathExpression[0]), Integer.parseInt(mathExpression[2]));
			case '*':
				return Math.multiplyExact(Integer.parseInt(mathExpression[0]), Integer.parseInt(mathExpression[2]));
			case '/':
				return divide(Integer.parseInt(mathExpression[0]), Integer.parseInt(mathExpression[2]));
			case '^':
				return (int) Math.pow(Integer.parseInt(mathExpression[0]), Integer.parseInt(mathExpression[2]));
			case '%':
				return Math.floorMod(Integer.parseInt(mathExpression[0]), Integer.parseInt(mathExpression[2]));
			default:
				System.out.println("Вы ввели некорректный знак математической операции");
		}
		return 0;
	}

	public int divide(int firstNum, int secondNum) {
		return firstNum / secondNum;
	}
}
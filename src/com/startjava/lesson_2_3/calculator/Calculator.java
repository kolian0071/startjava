package com.startjava.lesson_2_3.calculator;

public class Calculator {

	private int firstNum;
	private int secondNum;
	private char sign;

	public int getFirstNum() {
		return firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public char getSign() {
		return sign;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}

	public int calculate() {
		int result = 0;
		switch(sign) {
			case '+':
				result = add(firstNum, secondNum);
				break;
			case '-':
				result = subtract(firstNum, secondNum);
				break;
			case '*':
				result = multiply(firstNum, secondNum);
				break;
			case '/':
				result = divide(firstNum, secondNum);
				break;
			case '^':
				result = exp(firstNum, secondNum);
				break;
			case '%':
				result = mod(firstNum, secondNum);
				break;
		}
		return result;
	}

	public int add(int firstNum, int secondNum) {
		return firstNum + secondNum;
	}

	public int subtract(int firstNum, int secondNum) {
		return firstNum - secondNum;
	}

	public int multiply(int firstNum, int secondNum) {
		return firstNum * secondNum;
	}

	public int divide(int firstNum, int secondNum) {
		return firstNum / secondNum;
	}

	public int exp(int firstNum, int secondNum) {
		int result = 1;
			for(int i = 1; i <= secondNum; i++) {
				result *= firstNum;
			}
		return result;
	}

	public int mod(int firstNum, int secondNum) {
		return firstNum % secondNum;
	}
}
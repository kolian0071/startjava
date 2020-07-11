package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String answer;
		Calculator calculator = new Calculator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Calculator ver. 1.1");
		do {
			System.out.print("Введите математическое выражение: ");
			calculator.setMathExpression(scan.nextLine());
			System.out.println("Решение: " + calculator.calculate());
			
			do {
				System.out.println("Хотите продолжить? [Y/N]");
				answer = scan.nextLine();
			} while(!answer.equalsIgnoreCase("n") & !answer.equalsIgnoreCase("y"));
		} while(answer.equalsIgnoreCase("y"));
	}
}
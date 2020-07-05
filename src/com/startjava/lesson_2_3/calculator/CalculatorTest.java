package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String answer;
		Calculator calculator = new Calculator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Calculator ver. 1.1");
		do {
			System.out.println("Введите первое число:");
			calculator.setFirstNum(scan.nextInt());
			System.out.println("Введите знак математической операции:");
			calculator.setSign(scan.next().charAt(0));
			System.out.println("Введите второе число:");
			calculator.setSecondNum(scan.nextInt());
			System.out.println("Решение: " + calculator.calculate());
			scan.nextLine();
			
			do {
				System.out.println("Хотите продолжить? [Y/N]");
				answer = scan.nextLine();
			} while(!answer.equalsIgnoreCase("n") & !answer.equalsIgnoreCase("y"));
		} while(answer.equalsIgnoreCase("y"));
	}
}
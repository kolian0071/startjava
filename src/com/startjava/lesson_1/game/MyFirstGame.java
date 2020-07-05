package com.startjava.lesson_1.game;

public class MyFirstGame {
	public static void main(String[] args) {
		int hiddenNum = 13;
		System.out.println("Компьютер загадал число от 0 до 100. Попробуй отгадай");
		int enterNum = 10;

		while(enterNum != hiddenNum) {
			if(enterNum > hiddenNum) {
				System.out.println("Введенное вами чило больше того, что загадал компьютер");
				enterNum--;
			} else {
				System.out.println("Введенное вами чило меньше того, что загадал компьютер");
				enterNum++;
			}
		}
		System.out.println("Вы угадали!");
	}
}
package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		String answer;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Введите имя первого игрока");
			Player playerOne = new Player(scan.nextLine());
			System.out.println("Введите имя второго игрока");
			Player playerTwo = new Player(scan.nextLine());
			GuessNumber game = new GuessNumber(playerOne, playerTwo);
			game.start();
			do {
				System.out.println("Хотите продолжить? [Y/N]");
				answer = scan.nextLine();
			} while(!answer.equalsIgnoreCase("n") && !answer.equalsIgnoreCase("y"));
		} while(answer.equalsIgnoreCase("y"));
	}
}
//javac -encoding utf8 GuessNumberTest.java
//java GuessNumberTest
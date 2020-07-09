package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
	
	private Player playerOne;
	private Player playerTwo;
	private int randomNumber;
	Scanner scan = new Scanner(System.in);

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void start() {
		makeNumber();
		System.out.println("Компьютер загадал число. У вас 10 попыток чтобы его отгадать");
		do {
			System.out.println("Первый игрок введи число");
			playerOne.setNumber(scan.nextInt());
			if(compare(playerOne)) {
				break;
			}
			System.out.println("Второй игрок введи число");
			playerTwo.setNumber(scan.nextInt());
		} while(!compare(playerTwo));
	}

	private void makeNumber() {
		randomNumber = (int) ((Math.random() * 100) + 1);
	}

	private boolean compare(Player player) {
		if(player.getNumber() == randomNumber) {
			System.out.println("Игрок " + player.getName() + " победил!");
			return true;
		}
		System.out.println((player.getNumber() < randomNumber) ? "Загадонное число больше" : "Загаданное число меньше");
		return false;
	}
}
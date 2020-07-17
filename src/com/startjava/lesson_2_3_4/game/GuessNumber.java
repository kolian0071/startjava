package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
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
		generateNumber();
		System.out.println("Компьютер загадал число. У вас 10 попыток, чтобы отгадать его");
		for(int i = 0; i < 10; i++) {
			inputNumber(playerOne, i);
			if(compare(playerOne)) {
				break;
			}
			inputNumber(playerTwo, i );
			if(compare(playerTwo)) {
				break;
			}
		}
		printNumbers(playerOne);
		printNumbers(playerTwo);
		Arrays.fill(playerOne.getNumbers(), 0, playerOne.getRound(), 0);
		Arrays.fill(playerTwo.getNumbers(), 0, playerTwo.getRound(), 0);
	}

	private void generateNumber() {
		randomNumber = (int) ((Math.random() * 100) + 1);
	}

	private void inputNumber(Player player, int index) {
		player.setRound(index);
		System.out.println("Игрок " + player.getName() + ", введи число");
		player.setNumber(scan.nextInt(), index);
	}

	private boolean compare(Player player) {
		int number = player.getNumbers()[player.getRound()];
		if(player.getRound() == 9) {
			System.out.println("У игрока " + player.getName() + " закончились попытки");
		}
		if(number == randomNumber) {
			System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " c " + (player.getRound() + 1) + " попытки");
			return true;
		}
		System.out.println((number < randomNumber) ? "Загадонное число больше" : "Загаданное число меньше");
		return false;
	}

	private void printNumbers(Player player) {
		System.out.println(Arrays.toString(Arrays.copyOf(player.getNumbers(), player.getRound() + 1)));
	}
}
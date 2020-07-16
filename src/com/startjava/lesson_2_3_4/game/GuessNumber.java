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
			if(compare(playerOne, i)) {
				printNumbers(playerOne.getNumbers(), playerTwo.getNumbers(), i + 1, i);
				Arrays.fill(playerOne.getNumbers(), 0, i, 0);
				Arrays.fill(playerTwo.getNumbers(), 0, i - 1, 0);
				break;
			}
			if(i == 9) {
				System.out.println("У игрока " + playerOne.getName() + " закончились попытки");
			}
			inputNumber(playerTwo, i );
			if(compare(playerTwo, i)) {
				printNumbers(playerOne.getNumbers(), playerTwo.getNumbers(), i + 1, i + 1);
				Arrays.fill(playerOne.getNumbers(), 0, i, 0);
				Arrays.fill(playerTwo.getNumbers(), 0, i, 0);
				break;
			}
			if(i == 9) {
				System.out.println("У игрока " + playerTwo.getName() + " закончились попытки");
				printNumbers(playerOne.getNumbers(), playerTwo.getNumbers(), i + 1, i + 1);
				Arrays.fill(playerOne.getNumbers(), 0, i, 0);
				Arrays.fill(playerTwo.getNumbers(), 0, i, 0);
			}
		}
	}

	private void generateNumber() {
		randomNumber = (int) ((Math.random() * 100) + 1);
	}

	private void inputNumber(Player player, int index) {
		System.out.println("Игрок " + player.getName() + " , введи число");
		player.setNumber(scan.nextInt(), index);
	}

	private boolean compare(Player player, int round) {
		int number = player.getNumbers()[round];
		if(number == randomNumber) {
			System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " c " + (round + 1) + " попытки");
			return true;
		}
		System.out.println((number < randomNumber) ? "Загадонное число больше" : "Загаданное число меньше");
		return false;
	}

	private void printNumbers(int[] numbersPlayerOne, int[] numbersPlayerTwo, int roundPlayerOne, int roundPlayerTwo) {
		System.out.println(Arrays.toString(Arrays.copyOf(numbersPlayerOne, roundPlayerOne)));
		System.out.println(Arrays.toString(Arrays.copyOf(numbersPlayerTwo, roundPlayerTwo)));
	}
}
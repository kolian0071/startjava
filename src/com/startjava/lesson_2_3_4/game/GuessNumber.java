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
			System.out.println("Первый игрок, введи число");
			playerOne.setNumbers(scan.nextInt(), i);
			if(compare(playerOne, i)) {
				printNumbers(playerOne.getNumbers(), i + 1);
				printNumbers(playerTwo.getNumbers(), i);
				Arrays.fill(playerOne.getNumbers(), 0, i, 0);
				Arrays.fill(playerOne.getNumbers(), 0, i - 1, 0);
				break;
			}
			if(i == 9) {
				System.out.println("У игрока " + playerOne.getName() + " закончились попытки");
			}
			System.out.println("Второй игрок, введи число");
			playerTwo.setNumbers(scan.nextInt(), i);
			if(compare(playerTwo, i)) {
				printNumbers(playerOne.getNumbers(), i + 1);
				printNumbers(playerTwo.getNumbers(), i + 1);
				break;
			}
			if(i == 9) {
				System.out.println("У игрока " + playerTwo.getName() + " закончились попытки");
			}
		}
	}

	private void generateNumber() {
		randomNumber = (int) ((Math.random() * 100) + 1);
	}

	private boolean compare(Player player, int round) {
		if(player.getNumbers()[round] == randomNumber) {
			round++;
			System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " c " + round + " попытки");
			return true;
		}
		System.out.println((player.getNumbers()[round] < randomNumber) ? "Загадонное число больше" : "Загаданное число меньше");
		return false;
	}

	private void printNumbers(int[] array, int round) {
		int[] numbers = Arrays.copyOf(array, round);
		System.out.println(Arrays.toString(numbers));
	}
}
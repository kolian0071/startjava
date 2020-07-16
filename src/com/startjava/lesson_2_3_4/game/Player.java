package com.startjava.lesson_2_3_4.game;

public class Player {
	
	private String name;
	private int round;
	private int[] numbers = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumber(int number, int index) {
		numbers[index] = number;
	}
}
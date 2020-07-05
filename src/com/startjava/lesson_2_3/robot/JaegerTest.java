package com.startjava.lesson_2_3.robot;

public class JaegerTest {

	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1.980f, 7, 8, 6);
		Jaeger jaegerTwo = new Jaeger("Coyote Tango", "Mark-1", "Japan", 85.34f, 2.312f, 5, 7, 4);

		System.out.println(jaegerTwo.getMark());
		jaegerTwo.setMark("Mark-4");
		System.out.println(jaegerTwo.getMark());
		System.out.println(jaegerOne.scanKaiju());
		System.out.println(jaegerOne.getSpeed());
		jaegerOne.setSpeed(5);
		System.out.println(jaegerOne.getSpeed());
	}
}
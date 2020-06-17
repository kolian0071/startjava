import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		boolean exit = true;
		boolean exitCicle = true;
		String answer;
		Calculator calculator = new Calculator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Calculator ver. 1.1");
		while(exit) {
			exit = true;
			exitCicle = true;
			System.out.println("Введите первое число:");
			calculator.setFirstNum(scan.nextInt());
			System.out.println("Введите знак математической операции:");
			calculator.setSign(scan.next().charAt(0));
			System.out.println("Введите второе число:");
			calculator.setSecondNum(scan.nextInt());
			calculator.solution();
			System.out.println("Решение: " + calculator.getResult());
			scan.nextLine();
			
			while(exitCicle) {
				System.out.println("Хотите продолжить? [Y/N]");
				answer = scan.nextLine();
				if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
					exitCicle = false;
				} else if(answer.equals("n") || answer.equalsIgnoreCase("no")) {
					exit = false;
					break;
				} 
			}
		}
	}
}
import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		boolean exit = true;
		boolean exitCicle = false;
		String answer;
		Scanner scan = new Scanner(System.in);

		while(exit) {
			GuessNumber game = new GuessNumber();
			System.out.println("Введите имя первого игрока");
			Player playerOne = new Player(scan.nextLine());
			System.out.println("Введите имя второго игрока");
			Player playerTwo = new Player(scan.nextLine());
			game.randomNumber();
			System.out.println("Компьютер загадал число. Попробуйте отгадать");
			while(!game.getWinner()) {
				System.out.println("Первый игрок введи число");
				playerOne.setNumber(scan.nextInt());
				game.compare(playerOne.getNumber());
				if(game.getWinner()) {
					System.out.println("Игрок " + playerOne.getName() + " выиграл");
					exitCicle = true;
					break;
				} else {
					System.out.println("Второй игрок введи число");
					playerTwo.setNumber(scan.nextInt());
					game.compare(playerTwo.getNumber());
					if(game.getWinner()) {
						System.out.println("Игрок " + playerTwo.getName() + " выиграл");
						exitCicle = true;
						break;
					}
				}
			}
			scan.nextLine();
			while(exitCicle) {
				System.out.println("Хотите повторить? [Y/N]");
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
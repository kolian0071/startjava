import java.util.Scanner;

public class GuessNumber {
	
	private int randomNumber;
	private boolean winner = false;
	Scanner scan = new Scanner(System.in);

	public int getRandomNumber() {
		return randomNumber;
	}

	public boolean getWinner() {
		return winner;
	}

	public void makeNumber() {
		randomNumber = (int) (Math.random() * 100);
	}

	public void start (Player playerOne, Player playerTwo) {
		makeNumber();
		System.out.println("Компьютер загадал число. Попробуйте отгадайте");
		while(!winner) {
			System.out.println("Первый игрок введи число");
			playerOne.setNumber(scan.nextInt());
			compare(playerOne);
			if(!winner) {
				System.out.println("Второй игрок введи число");
				playerTwo.setNumber(scan.nextInt());
				compare(playerTwo);
			}
		}
	}

	public boolean compare(Player player) {
		if(player.getNumber() > randomNumber) {
			System.out.println("Загаданное число меньше");
			return false;
		} else if(player.getNumber() < randomNumber) {
			System.out.println("Загадонное число больше");
			return false;
		} else {
			System.out.println("Игрок " + player.getName() + " победил!");
			winner = true;
			return true;
		}
	}
}
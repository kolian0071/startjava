public class GuessNumber {
	
	private int randomNumber;
	private boolean winner = false;

	public int getRandomNumber() {
		return randomNumber;
	}

	public boolean getWinner() {
		return winner;
	}

	public void randomNumber() {
		randomNumber = (int) (Math.random() * 100);
	}

	public void compare(int number) {
		if(number > randomNumber) {
			System.out.println("Загаданное число меньше");
		} else if(number < randomNumber) {
			System.out.println("Загадонное число больше");
		} else {
			winner = true;
		}
	}
}
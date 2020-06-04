public class MyFirstGame {
	public static void main(String[] args) {
		int num = 13; //загаданное число
		System.out.println("Компьютер загадал число от 0 до 100. Попробуй отгадай");
		int enterNum = 10; //число, которое ввёл игрок

		while(enterNum != num) {
			if(enterNum > num) {
				System.out.println("Введенное вами чило больше того, что загадал компьютер");
				enterNum--;
			} else {
				System.out.println("Введенное вами чило меньше того, что загадал компьютер");
				enterNum++;
			}
		}
		System.out.println("Вы угадали!");
	}
}
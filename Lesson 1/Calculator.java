public class Calculator {
	public static void main(String[] args) {
		int firstNum = 4;
		int secondNum = 0;
		char sign = '^';

		System.out.println("Calculator ver. 1.0");
		if(sign == '+') {
			int result = firstNum + secondNum;
			System.out.println("Сумма чисел " + firstNum + " и " + secondNum + " равна " + result);
		} else if(sign == '-') {
			int result = firstNum - secondNum;
			System.out.println("Результ вычитания из числа " + firstNum + " числа " + secondNum + " равен " + result);
		} else if(sign == '*') {
			int result = firstNum * secondNum;
			System.out.println("Произведение чисел " + firstNum + " и " + secondNum + " равно " + result);
		} else if(sign == '/') {
				if(firstNum % secondNum == 0) {
					int result = firstNum / secondNum;
					System.out.println("Поделив число " + firstNum + " на число " + secondNum + " получаем " + result);
				} else {
						float result = (float)firstNum / (float)secondNum;
						System.out.println("Поделив число " + firstNum + " на число " + secondNum + " получаем " + result);
				}
			
		} else if(sign == '^') {
			int result = 1;
			for(int i = 1; i <= secondNum; i++) {
					result *= firstNum;
			}
				System.out.println("Число " + firstNum + " в степени " + secondNum + " равно " + result);
			
		} else if(sign == '%') {
			int result = firstNum % secondNum;
			System.out.println("Остаток от деления числа " + firstNum + " на число " + secondNum + " равен " + result);
		} else {
			System.out.println("Указанная Вами математическая операция не может быть выполнена");
		}
	}
}
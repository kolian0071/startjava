public class Calculator {
	public static void main(String[] args) {
		int firstNum = 4;
		int secondNum = 3;
		char math = '/';

		System.out.println("Calculator ver. 1.0");
		if(math == '+') {
			int result = firstNum + secondNum;
			System.out.println("Сумма чисел " + firstNum + " и " + secondNum + " равна " + result);
		} else if(math == '-') {
			int result = firstNum - secondNum;
			System.out.println("Результ вычитания из числа " + firstNum + " числа " + secondNum + " равен " + result);
		}	else if(math == '*') {
			int result = firstNum * secondNum;
			System.out.println("Произведение чисел " + firstNum + " и " + secondNum + " равно " + result);
		}	else if(math == '/') {
				if(firstNum % secondNum == 0) {
					int result = firstNum / secondNum;
					System.out.println("Поделив число " + firstNum + " на число " + secondNum + " получаем " + result);
				} else {
						float floatFirsNum = firstNum;
						float floatSecondNum = secondNum;
						float result = floatFirsNum / floatSecondNum;
						System.out.println("Поделив число " + firstNum + " на число " + secondNum + " получаем " + result);
				}
			
		} else if(math == '^') {
			if(secondNum == 0) {
				System.out.println("Число " + firstNum + " в степени " + secondNum + " равно 1");
			} else {
				int result = firstNum;
				for(int i = 1; i < secondNum; i++) {
					result = result * firstNum;
				}
				System.out.println("Число " + firstNum + " в степени " + secondNum + " равно " + result);
			}
		} else if(math == '%') {
			int result = firstNum % secondNum;
			System.out.println("Остаток от деления числа " + firstNum + " на число " + secondNum + " равен " + result);
		} else {
			System.out.println("Указанная Вами математическая операция не может быть выполнена");
		}
	}
}
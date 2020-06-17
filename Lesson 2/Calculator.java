public class Calculator {

	private int firstNum;
	private int secondNum;
	private char sign;
	private int result;

	public int getFirstNum() {
		return firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public char getSign() {
		return sign;
	}

	public int getResult() {
		return result;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}

	public void solution() {
		switch(sign) {
			case '+': result = addition(firstNum, secondNum);
			break;
			case '-': result = subtraction(firstNum, secondNum);
			break;
			case '*': result = multiplication(firstNum, secondNum);
			break;
			case '/': result = division(firstNum, secondNum);
			break;
			case '^': result = exponentiation(firstNum, secondNum);
			break;
			case '%': result = module(firstNum, secondNum);
		}
	}

	public int addition(int firstNum, int secondNum) {
		return firstNum + secondNum;
	}

	public int subtraction(int firstNum, int secondNum) {
		return firstNum - secondNum;
	}

	public int multiplication(int firstNum, int secondNum) {
		return firstNum * secondNum;
	}

	public int division(int firstNum, int secondNum) {
		return firstNum / secondNum;
	}

	public int exponentiation(int firstNum, int secondNum) {
		int result = 1;
			for(int i = 1; i <= secondNum; i++) {
				result *= firstNum;
			}
		return result;
	}

	public int module(int firstNum, int secondNum) {
		return firstNum % secondNum;
	}


}
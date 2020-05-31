public class ConditionalStatement  {
	public static void main(String[] args) {
		int age = 25;
		boolean sex = true;
		double height = 1.83;
		char firstNameChar = 'Н';

		if(age > 20) {
			System.out.println("Вам больше 20 лет");
		}

		if(sex) {
			System.out.println("Привет, мужик!");
		}

		if(!sex) {
			System.out.println("Привет, девчуля");
		}

		if(height < 1.80) {
			System.out.println("Ваш рост меньше 1м 80см");
		} else {
			System.out.println("Ваш рост больше 1м 80см");
		}

		if(firstNameChar == 'М') {
			System.out.println("Ваше имя начинается на букву М");
		} else if(firstNameChar == 'И') {
			System.out.println("Ваше имя начинается на букву И");
		} else {
			System.out.println("Ваше имя начинается не на букву М или И");
		}
	}
}
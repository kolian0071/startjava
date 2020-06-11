public class WolfTest {
	
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.sex = true;
		wolfOne.name = "Wolfie";
		wolfOne.weight = 24;
		wolfOne.age = 4;
		wolfOne.color = "Grey";

		System.out.println("sex = " + wolfOne.sex);
		System.out.println("name = " + wolfOne.name);
		System.out.println("weight = " + wolfOne.weight);
		System.out.println("age = " + wolfOne.age);
		System.out.println("color = " + wolfOne.color);

		wolfOne.move();
		wolfOne.sit();
		wolfOne.run();
		wolfOne.howl();
		wolfOne.hunt();
	}
}
public class WolfTest {
	
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setSex(true);
		wolfOne.setName("Wolfie");
		wolfOne.setWeight(24);
		wolfOne.setAge(4);
		wolfOne.setColor("Grey");

		System.out.println("sex = " + wolfOne.getSex());
		System.out.println("name = " + wolfOne.getName());
		System.out.println("weight = " + wolfOne.getWeight());
		System.out.println("age = " + wolfOne.getAge());
		System.out.println("color = " + wolfOne.getColor());

		wolfOne.move();
		wolfOne.sit();
		wolfOne.run();
		wolfOne.howl();
		wolfOne.hunt();
	}
}
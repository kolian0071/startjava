public class Wolf {
	
	private boolean sex;
	private String name;
	private int weight;
	private int age;
	private String color;

	public boolean getSex() {
		return sex;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

	public String getColor() {
		return color;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setAge(int age) {
		if(age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void move() {

	}

	public void sit() {

	}

	public void run() {

	}

	public String howl() {
		return "У-у-у-у-у-у-у-у";
	}

	public boolean hunt() {
		return true;
	}
}
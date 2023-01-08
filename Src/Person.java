// Ini adalah kelas abstract yang akan dijadikan parent class dari Student dan Lecture class
public abstract class Person {

	// Constructor dalam pembuatan class Person
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// Variable yang ada didalam Person class ini
	private String name;
	private int age;
	private String gender;
	
	// Setters and getters dari masing masing variable di class ini
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	// Method void yang wajib di override oleh child class dari class ini
	public abstract void introduction();
}

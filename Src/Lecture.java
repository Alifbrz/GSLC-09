// Class Lecture yang memiliki parent class Person dan mengimplementasi semua method yang ada di interface CanteenTransaction
public class Lecture extends Person implements CanteenTransaction{

	// Constructor yang digunakan untuk membuat class Lecture
	public Lecture(String name, int age, String gender, String lectureID, String subjectTeach, int money) {
		super(name, age, gender);
		this.lectureID = lectureID;
		this.subjectTeach = subjectTeach;
		this.money = money;
	}

	// Variable yang ada pada class Lecture
	private String lectureID;
	private String subjectTeach;
	private int money;
	
	// Bertujuan untuk membeli makanan dan membayar dengan pemotongan langsung uang deposit dosen
	@Override
	public void buy(Food food) {
		this.money -= food.getPrice();
		System.out.println(food.getName() + " has been bought by " + this.getName() + " and " + food.getPrice() + " will be deducted from " + this.getName() + "'s Lecture Deposit Money");
	}
	
	// Bertujuan untuk pengenalan dosen
	@Override
	public void introduction() {
		System.out.print(this.getName() + ": Perkenalkan saya " + this.getName() + ", saya disini mengajar mata kuliah " + this.getSubjectTeach());
		System.out.println(", ID saya bisa kalian catat yaitu " + this.lectureID + ", semoga kalian bisa lulus dengan nilai memuaskan di mata kuliah saya ya");
	}

	// Setters getters variable di class Lecture
	public String getLectureID() {
		return lectureID;
	}

	public void setLectureID(String lectureID) {
		this.lectureID = lectureID;
	}

	public String getSubjectTeach() {
		return subjectTeach;
	}

	public void setSubjectTeach(String subjectTeach) {
		this.subjectTeach = subjectTeach;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}

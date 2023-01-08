// Class Student yang memiliki parent class Person dan mengimplementasi semua method yang ada di interface CanteenTransaction dan SSCComplaint
public class Student extends Person implements CanteenTransaction, SSCComplaint {
	
	// Constructor untuk membuat Student class
	public Student(String name, int age, String gender, String studentID, int semester) {
		super(name, age, gender);
		this.studentID = studentID;
		this.semester = semester;
	}

	// Variable pada Student class
	private String studentID;
	private int semester;

	// Setters getters variable yang dimiliki Student class
	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	// Bertujuan untuk komplain terhadap suatu mata kuliah
	@Override
	public void subject_complaint(String subject, String description) {
		System.out.println("Name       : " + this.getName());
		System.out.println("Student ID : " + this.studentID);
		System.out.println("Subject    : " + subject);
		System.out.println("Description: " + description);
		
		System.out.println("\nWe receive your complaint and we will inform you the solution as soon as possible!");
	}

	// Bertujuan untuk melaporkan masalah finansial mahasiswa
	@Override
	public void financial_problem(String description) {
		System.out.println("Name       : " + this.getName());
		System.out.println("Student ID : " + this.studentID);
		System.out.println("Description: " + description);
		
		System.out.println("\nWe receive your problem and we will inform you the solution as soon as possible!");
	}

	// Bertujuan untuk membeli pesanan dan membayar menggunakan cash
	@Override
	public void buy(Food food) {
		System.out.println(food.getName() + " has been bought by " + this.getName() + " and " + this.getName() + " needs to pay " + food.getPrice() + " with cash");
	}

	// Bertujuan untuk pengenalan mahasiswa
	@Override
	public void introduction() {
		System.out.print(this.getName() + ": Halo, perkenalkan saya adalah mahasiswa bernama " + this.getName() + " dengan NIM " + this.getStudentID());
		System.out.println(", Umur saya " + this.getAge() + " tahun dan saya sekarang berada di semester " + this.semester);
	}
}

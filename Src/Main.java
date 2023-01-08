import java.util.*;

public class Main {
	
	// Berfungsi untuk menangkap inputan yang diberikan
	Scanner scan = new Scanner(System.in);
	
	// Berfungsi untuk menyimpan class data
	ArrayList <Food> foodList = new ArrayList<Food>();
	ArrayList <Person> personList = new ArrayList<Person>();
	
	// Function sederhana supaya user bisa membaca output dulu
	void press() {
		System.out.print("\nPress enter to continue"); 
		scan.nextLine();
	}
	// function untuk inisiasi data diawal
	void init() {
		// FOOD
		foodList.add(new Food("Rocky Fried Chicken", 10000));
		foodList.add(new Food("Selera Nasi Goreng", 17000));
		foodList.add(new Food("Waffle Coklat", 8000));
		foodList.add(new Food("Indomie Goreng Jumbo Double", 20000));
		foodList.add(new Food("Soto Daging", 15000));
		
		// LECTURE
		personList.add(new Lecture("Bill Gates", 30, "Male", "D0001", "Algorithm", 2000000));
		personList.add(new Lecture("Elon Musk", 27, "Male", "D0002", "Entrepreneurship", 2500000));
		personList.add(new Lecture("Mark Zuckerberg", 45, "Male", "D0003", "Character Building", 1750000));
		
		// STUDENT
		personList.add(new Student("William Tanuwijaya", 21, "Male", "2301900001", 7));
		personList.add(new Student("Raisa Adriana", 20, "Female", "2302000001", 5));
		personList.add(new Student("Jessica Mila", 19, "Female", "2302100001", 3));
		personList.add(new Student("Kiki CJR", 18, "Male", "2302200001", 1));
	}
	
	// Print header untuk setiap diawal loop
	void header() {
		System.out.println("===========================================================");
		System.out.println("|                     BINA  NUSANTARA                     |");
		System.out.println("|                  world class univerity                  |");
		System.out.println("===========================================================");
	}
	
	// Function untuk memilih menu dengan return int
	int menu() {
		int choose = 0;
		
		System.out.println("1. Introduction");
		System.out.println("2. Show all person");
		System.out.println("3. Go to canteen");
		System.out.println("4. Go to SSC");
		System.out.println("5. Exit BINUS");

		// Loop terus sampai input yang diberikan bernilai antara 1-5
		do {
			System.out.print(">> ");
			choose = scan.nextInt();
		}while(choose < 1 || choose > 5);
		scan.nextLine();
		
		//return nilai inputan user
		return choose;
	}
	
	// Function untuk introduction setiap orang yang ada di BINUS
	void introduction() {
		for(int i = 0; i < personList.size(); i++) {
			Person person = personList.get(i);
			person.introduction();
		}
	}
	
	// Function untuk menampilkan semua data yang ada pada ArrayList personList (class Person)
	void show() {
		// Tampilkan header person
		System.out.println("===========================================================");
		System.out.println("|                         PERSON                          |");
		System.out.println("===========================================================");
		
		// Tampilkan semua orang yang ada di BINUS yang di tampung di personList
		for(int i = 0; i < personList.size(); i++) {
			Person person = personList.get(i);
			System.out.print(i+1 + ". " + person.getName() + ": " + person.getGender() + " " + person.getAge());
			if(person instanceof Student) System.out.println("");
			else System.out.println(" with " + ((Lecture)person).getMoney() + " Lecture Deposit Cash");
		}
	}
	
	// Function untuk melakukan transaksi pada kantin
	void canteen() {
		// Tampilkan semua person yang ada di BINUS
		show();
		System.out.println("");
		
		// Pilih siapa yang akan melakukan transaksi di kantin
		int choose_person;
		do {
			System.out.print(">> ");
			choose_person = scan.nextInt();
		}while(choose_person < 1 || choose_person > personList.size());
		scan.nextLine();
		
		// Tampilkan header kantin
		System.out.println("===========================================================");
		System.out.println("|                         CANTEEN                         |");
		System.out.println("===========================================================");
		
		// Tampilkan semua menu yang ada di kantin yang di tampung di foodList
		for(int i = 0; i < foodList.size(); i++) {
			Food food = foodList.get(i);
			System.out.println(i+1 + ". " + food.getName() + " - " + food.getPrice());
		}
		
		// Pilih makanan apa yang mau dibayar
		System.out.println("");
		int choose_food;
		do {
			System.out.print(">> ");
			choose_food = scan.nextInt();
		}while(choose_food < 1 || choose_food > foodList.size());
		scan.nextLine();
		
		// Pindahkan kedalam variable baru data yang barusan dipilih
		Person person = personList.get(choose_person-1);
		Food food = foodList.get(choose_food-1);
		
		// Lakukan transaksi
		if(person instanceof Student) ((Student)person).buy(food);
		else ((Lecture)person).buy(food);
	}
	
	void ssc() {
		// Tampilkan semua student yang ada di BINUS
		int counter = 0;
		
		for(int i = 0; i < personList.size(); i++) {
			Person person = personList.get(i);
			if(person instanceof Student) {
				counter++;
				System.out.println(counter + ". " + person.getName() + " - " + ((Student)person).getStudentID());
			}
		}
		System.out.println("");
				
		// Pilih siapa yang akan melakukan mengurus urusan di SSC
		int choose_person;
		do {
			System.out.print(">> ");
			choose_person = scan.nextInt();
		}while(choose_person < 1 || choose_person > personList.size());
		scan.nextLine();
		
		// Ambil data student yang tadi
		counter = 1;
		Student student = new Student("", 0, "", "", 0);
		for(int i = 0; i < personList.size(); i++) {
			Person person = personList.get(i);
			if(person instanceof Student) {
				if (choose_person == counter) {
					student = (Student)person;
					break;
				}
				counter++;
			}
		}
		
		// Tampilkan header SSC
		System.out.println("===========================================================");
		System.out.println("|                 STUDENT SERVICE CENTER                  |");
		System.out.println("===========================================================");
		
		System.out.println("1. Subject Complaint");
		System.out.println("2. Financial Problem");
		
		// Pilih laporan apa yang ingin dilakukan
		int choose_ssc;
		do {
			System.out.print(">> ");
			choose_ssc = scan.nextInt();
		}while(choose_ssc < 1 || choose_ssc > 2);
		scan.nextLine();
		
		// Masuk kedalam kondisi masing masing
		String subject, description;
		if(choose_ssc == 1) {
			System.out.print("Subject    : ");
			subject = scan.nextLine();
			System.out.print("Description: ");
			description = scan.nextLine();
			
			System.out.println("");
			student.subject_complaint(subject, description);
		}else {
			System.out.print("Description: ");
			description = scan.nextLine();
			
			System.out.println("");
			student.financial_problem(description);
		}
	}
	
	public Main() {
		init();
		
		int choose;
		
		do {
			header();
			choose = menu();
			
			if(choose == 1) introduction();
			else if(choose == 2) show();
			else if(choose == 3) canteen();
			else if(choose == 4) ssc();
			else if(choose == 5) break;
			
			press();
		}while(true);
	}

	public static void main(String[] args) {
		new Main();
	}

}

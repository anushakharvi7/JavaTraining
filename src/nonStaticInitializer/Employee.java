package nonStaticInitializer;

public class Employee {
	
	static int salary = 700;
	int a=10;
	
	public static void demo() {
		System.out.println(salary);
	}
	void demo1() {
		System.out.println("Salary of Employee");
		System.out.println(salary);
	}

	public static void main(String[] args) {
		System.out.println(salary);

	}

}

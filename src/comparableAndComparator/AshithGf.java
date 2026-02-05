package comparableAndComparator;

public class AshithGf implements Comparable<AshithGf> {
	
	String name;
	int age;
	int id;
	String bloodGroup;
	long adharNo;
	double percentage;
	double salary;
	
	public AshithGf(String name, int age, int id, String bloodGroup, long adharNo, double percentage, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.bloodGroup = bloodGroup;
		this.adharNo = adharNo;
		this.percentage = percentage;
		this.salary = salary;
	}
	


	@Override
	public String toString() {
		return "AshithGf [name=" + name + ", age=" + age + ", id=" + id + ", bloodGroup=" + bloodGroup + ", adharNo="
				+ adharNo + ", percentage=" + percentage + ", salary=" + salary + "]";
	}


	public int compareTo(AshithGf gf) {
		return (int) (this.salary-gf.salary);
	}

}

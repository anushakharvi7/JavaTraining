package encapsulation;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private int age;
	private String department;
	private long cno;
	private String address;
	private String gender;
	private String bloodGroup;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public long getCno() {
		return cno;
	}


	public void setCno(long cno) {
		this.cno = cno;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getBloodGroup() {
		return bloodGroup;
	}


	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public void getAllData(String userName, int password) {
		if(userName=="User" && password==987) {
			System.out.println("ID:-"+id);
			System.out.println("Name:-"+name);
			System.out.println("Salary:-"+salary);
			System.out.println("Age:-"+age);
			System.out.println("Department:-"+department);
			System.out.println("Contact No.:-"+cno);
			System.out.println("Address:-"+address);
			System.out.println("Gender:-"+gender);
			System.out.println("Blood Group:-"+bloodGroup);
		}else {
			System.out.println("Invalid Password");
		}
	}

	
	
}

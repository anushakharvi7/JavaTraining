package constructorOverloading;

public class Collage {
	
	int sId;
	String sName;
	String sAdress;
	String sDepartment;
	String sBloodGroup;
	char sSec;
	
	String pName;
	int pId;
	int pSalary;
	String pDepartment;
	public Collage(int sId, String sName, String sAdress, String sDepartment, String sBloodGroup, char sSec) {
		this.sId = sId;
		this.sName = sName;
		this.sAdress = sAdress;
		this.sDepartment = sDepartment;
		this.sBloodGroup = sBloodGroup;
		this.sSec = sSec;
	}
	public Collage(String pName, int pId, int pSalary, String pDepartment) {
		this.pName = pName;
		this.pId = pId;
		this.pSalary = pSalary;
		this.pDepartment = pDepartment;
	}
	void printStudentData() {
		System.out.println("----------------------");
		System.out.println("This is a details of Student:"+sName);
		System.out.println("----------------------");
		System.out.println("Id:-"+sId);
		System.out.println("Name:-"+sName);
		System.out.println("Adress:-"+sAdress);
		System.out.println("Department:-"+sDepartment);
		System.out.println("BloodGroup:-"+sBloodGroup);
		System.out.println("Section"+sSec);
	}
	void printProfData() {
		System.out.println("----------------------");
		System.out.println("This is a details of Professor:"+pName);
		System.out.println("----------------------");
		System.out.println("Name:-"+pName);
		System.out.println("Id:-"+pId);
		System.out.println("Salary:-"+pSalary);
		System.out.println("Department:-"+pDepartment);
	}
	public static void main(String [] args) {
		Collage chirag = new Collage(101,"Chirag Rai", "Puttur", "AIML","B+",'C');
		Collage ashith= new Collage(102,"Ashith Rai", "Puttur", "AI","A+",'B');
		
		chirag.printStudentData();
		ashith.printStudentData();
		
		Collage abhishek = new Collage("Abhishek", 678, 67000, "AIML");
		Collage govindRaj = new Collage("GovindRaj", 566, 80000, "AI");
		
		abhishek.printProfData();
		govindRaj.printProfData();
	}

}

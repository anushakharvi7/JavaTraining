package constructorOverloading;

public class Flipkart {
	
	String sName;
	int sProdut;
	int sPrice;
	String sEmail;
	String sAddress;
	long sCno;
	String sGender;
	
	
	int eId;
	String eName;
	String eAdress;
	String eProdut;
	long eCno;;
	int eToatl;
	String ePaymode;
	
	
	public Flipkart(String sName, int sProdut, int sPrice, String sEmail, String sAddress, long sCno, String sGender) {
		this.sName = sName;
		this.sProdut = sProdut;
		this.sPrice = sPrice;
		this.sEmail = sEmail;
		this.sAddress = sAddress;
		this.sCno = sCno;
		this.sGender = sGender;
	}
	
	public Flipkart(int eId, String eName, String eAdress, String eProdut, long eCno, int eToatl, String ePaymode) {
	
		this.eId = eId;
		this.eName = eName;
		this.eAdress = eAdress;
		this.eProdut = eProdut;
		this.eCno = eCno;
		this.eToatl = eToatl;
		this.ePaymode = ePaymode;
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

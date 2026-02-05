package objectClass;

public class ChiragGf {
	String name;
	int id;
	int age;
	String address;
	long cno;
	String bloodGroup;
	String instaAccount;
	
	

	public ChiragGf(String name, int id, int age, String address, long cno, String bloodGroup, String instaAccount) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.address = address;
		this.cno = cno;
		this.bloodGroup = bloodGroup;
		this.instaAccount = instaAccount;
	}
	


	@Override
	public String toString() {
		return "ChiragGf [name=" + name + ", id=" + id + ", age=" + age + ", address=" + address + ", cno=" + cno
				+ ", bloodGroup=" + bloodGroup + ", instaAccount=" + instaAccount + "]";
	}

	public static void main(String[] args) {
		ChiragGf pooja = new ChiragGf("Pooja",101,21,"Near Puttur",8745647892l,"B+","@Pooja_Queen");
		
		ChiragGf ashitha = new ChiragGf("Ashitha",102,20,"Near Manglore",8759634192l,"A+","@Ashitha_Queen");
		
		System.out.println(pooja);
		System.out.println(ashitha);
	}

}

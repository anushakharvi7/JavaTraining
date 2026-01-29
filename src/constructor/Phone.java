package constructor;

public class Phone {
	
	String name;
	int ram;
	int rom;
	int camera;
	int battery;
	String color;
	
	Phone(String name, int ram, int rom, int camera, int battery , String color){
		this.name=name;
		this.ram=ram;
		this.rom=rom;
		this.camera=camera;
		this.battery=battery ;
		this.color=color;
	}

	public static void main(String[] args) {
		Phone vivo= new Phone("vivo",6,16,20,5000, "Platinum Grey");
				
		System.out.println(vivo.name);
		System.out.println(vivo.ram);
		System.out.println(vivo.rom);
		System.out.println(vivo.camera);
		System.out.println(vivo.battery);
		System.out.println(vivo.color);

	}

}

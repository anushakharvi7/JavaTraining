package constructor;
import java.util.Scanner;

public class Phoneuserinput {

	String name;
	int ram;
	int rom;
	int camera;
	int battery;
	String color;
	
	Phoneuserinput(String name, int ram, int rom, int camera, int battery , String color){
		this.name=name;
		this.ram=ram;
		this.rom=rom;
		this.camera=camera;
		this.battery=battery ;
		this.color=color;
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter phone name");
		String phone=sc.nextLine();
	}

}

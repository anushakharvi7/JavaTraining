package methodchaining;

public class Demo {
	
	public Demo m1() {
		System.out.println("This is a First method");
		return this;
	}
	public Demo m2() {
		System.out.println("This is a Second method");
		return this;
	}public Demo m3() {
		System.out.println("This is a Third method");
		return this;
	}public Demo m4() {
		System.out.println("This is a Fourth method");
		return this;
	}public Demo m5() {
		System.out.println("This is a Fifth method");
		return this;
	}

	public static void main(String[] args) {
		Demo d=new Demo();
		d.m1();
		d.m2();
		d.m3();
		d.m4();
		d.m4();
		System.out.println("----------------------------------------");
		d.m1().m2().m3().m4().m5();

	}

}

package utilityDemo;

public class Bottle {
	
	private int height;
	private String color;
	private int quantity;
	private String name;

	public int getHeight() {
		return height;
	}

	public Bottle setHeight(int height) {
		this.height = height;
		return this;
	}

	public String getColor() {
		return color;
	}

	public Bottle setColor(String color) {
		this.color = color;
		return this;
	}

	public int getQuantity() {
		return quantity;
	}

	public Bottle setQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}

	public String getName() {
		return name;
	}

	public Bottle setName(String name) {
		this.name = name;
		return this;
	}
	Bottle(){
		
	}
	public Bottle(int height, String color, int quantity , String name) {
		this.height=height;
		this.color=color;
		this.quantity=quantity;
		this.name=name;
	}
	public void printProperties() {
		System.out.println("Bottle [ color ="+color+",height="+height+",quantity ="+quantity+",name="+name+"]");
	}
	public static Bottle addBottle(String color, int height, int quantity, String name) {
		return new Bottle(height,color,quantity,name);
	}
	public static Bottle addBottle() {
		return new Bottle();
	}
	public static void main(String[] args) {
		addBottle().setHeight(3).setColor("Red").setQuantity(250).setName("Bindu").printProperties();
		addBottle("Pink",5,200,"Bindu").printProperties();
	}

}

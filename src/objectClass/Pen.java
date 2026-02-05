package objectClass;

public class Pen {
	
	
	public Pen(String name, int id, int price, String color) {
		super();
		this.name = name;
		this.id = id;
		Price = price;
		this.color = color;
	}

	String name;
	int id;
	int Price;
	String color;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

	@Override
	public String toString() {
		return "Pen [name=" + name + ", id=" + id + ", Price=" + Price + ", color=" + color + "]";
	}

	public static void main(String[] args) {
		Pen doms = new Pen("Doms",101, 20,"Red");
		Pen nataraj= new Pen("Nataraj",102,30,"Black");
		
		System.out.println(doms);
		System.out.println(nataraj);
	}

}

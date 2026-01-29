package objectDemo;

public class FlipkartEndUser {
	
	String name;
	long cno;
	String product;
	String email;
	int total;
	String paymode;

	public static void main(String[] args) {
		
		FlipkartEndUser sara;
		sara= new FlipkartEndUser();
		sara.name="Sara";
		sara.cno=7458964137l;
		sara.product="jeans";
		sara.email="sara@gmail.com";
		sara.total=560;
		sara.paymode="online";
		
		
		System.out.println("Flipkart End User Info");
		System.out.println(sara.name);
		System.out.println(sara.cno);
		System.out.println(sara.product);
		System.out.println(sara.email);
		System.out.println(sara.total);
		System.out.println(sara.paymode);
		
		System.out.println("---------------");
		
		
		FlipkartEndUser Tanu;
		Tanu= new FlipkartEndUser();
		Tanu.name="Tanu";
		Tanu.cno=7458463197l;
		Tanu.product="Shoes";
		Tanu.email="tanur@gmail.com";
		Tanu.total=1200;
		Tanu.paymode="offline";
		
		
		
		System.out.println(Tanu.name);
		System.out.println(Tanu.cno);
		System.out.println(Tanu.product);
		System.out.println(Tanu.email);
		System.out.println(Tanu.total);
		System.out.println(Tanu.paymode);

		System.out.println("---------------");
		
		FlipkartEndUser arya;
		arya= new FlipkartEndUser();
		arya.name="Arya";
		arya.cno=9658463197l;
		arya.product="Bottle";
		arya.email="aryashree@gmail.com";
		arya.total=135;
		arya.paymode="offline";
		
		
		
		System.out.println(arya.name);
		System.out.println(arya.cno);
		System.out.println(arya.product);
		System.out.println(arya.email);
		System.out.println(arya.total);
		System.out.println(arya.paymode);

	}

}

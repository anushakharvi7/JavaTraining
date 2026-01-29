package objectDemo;

public class Bookdetails {
	
	
	String name;
	int bookid;
	int pages;
	String author;
	String publisher;
	int publishyear;

	public static void main(String[] args) {
		
		Bookdetails novel = new Bookdetails();
		novel.name="The Art of being Alone";
		novel.bookid=1011;
		novel.pages=350;
		novel.author="Shreejith sutra";
		novel.publisher="Madva Publications";
		novel.publishyear=2023;
		
		System.out.println("Book name:-"+novel.name);
		System.out.println("Book ID:-"+novel.bookid);
		System.out.println("Book pages:-"+novel.pages);
		System.out.println("Book author:-"+novel.author);
		System.out.println("Book Publisher:-"+novel.publisher);
		System.out.println("Book Published Year:-"+novel.publishyear);
		
		System.out.println("----------------------");

		Bookdetails fiction = new Bookdetails();
		fiction.name="Can we be strangers again";
		fiction.bookid=1012;
		fiction.pages=420;
		fiction.author="Raj Shankar";
		fiction.publisher="Raj Publications";
		fiction.publishyear=2019;
		
		System.out.println("Book name:-"+fiction.name);
		System.out.println("Book ID:-"+fiction.bookid);
		System.out.println("Book pages:-"+fiction.pages);
		System.out.println("Book author:-"+fiction.author);
		System.out.println("Book Publisher:-"+fiction.publisher);
		System.out.println("Book Published Year:-"+fiction.publishyear);
		
		System.out.println("----------------------");
		
		Bookdetails horror = new Bookdetails();
		horror.name="The Evil";
		horror.bookid=1013;
		horror.pages=250;
		horror.author="Yash Pichai";
		horror.publisher="Glory Publications";
		horror.publishyear=2020;
		
		System.out.println("Book name:-"+horror.name);
		System.out.println("Book ID:-"+horror.bookid);
		System.out.println("Book pages:-"+horror.pages);
		System.out.println("Book author:-"+horror.author);
		System.out.println("Book Publisher:-"+horror.publisher);
		System.out.println("Book Published Year:-"+horror.publishyear);
		
		
		
		
		
	}

}

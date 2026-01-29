package decstmt;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Veg");
		System.out.println("2. Non Veg");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:{
			System.out.println("1.South Indian");
			System.out.println("2.North Indian");
			System.out.println("3.French");
			System.out.println("Enter the choice");
			int opt=sc.nextInt();
			
			switch(opt) {
			case 1:{
				System.out.println("1.Idli Sambar	40rs");
				System.out.println("2.Dosa chutney	60rs");
				System.out.println("3.Rice Curry	120rs");
				System.out.println("Enter the choice");
				int select=sc.nextInt();
				
				switch(select) {
				case 1:{
					System.out.println("Idli Sambar is 40rs");
					System.out.println("Enter the Amount");
					int amount=sc.nextInt();
					if(amount==40) {
						System.out.println("Payment Done");
						System.out.println("Thank You...");
						
					}else {
						System.out.println("Please enter correct Amount");
					}
					break;				
				}
				case 2:{
					System.out.println("Dosa Chutney is 60rs");
					System.out.println("Enter the Amount");
					int amount=sc.nextInt();
					if (amount==60) {
						System.out.println("Payment Done");
						System.out.println("Thank You...");
					}else {
						System.out.println("Please enter correct Amount");
					}
					
					break;
				}
				case 3:{
					System.out.println("Rice Curry is 120rs");
					System.out.println("Enter the Amount");
					int amount=sc.nextInt();
					if (amount==120) {
						System.out.println("Payment Done");
						System.out.println("Thank You...");
					}else {
						System.out.println("Please enter correct Amount");
					}
					break;
				}
				
				}	
			}
			
			break;
			case 2:{
				System.out.println("1.Parota    100rs");
				System.out.println("2.Paneer    170rs");
				System.out.println("3.Rice dal  130rs");
				System.out.println("Enter the choice");
				int select=sc.nextInt();
				
				switch(select) {
				case 1:{
					System.out.println("Parota is 100rs");
					System.out.println("Enter the Amount");
					int amount=sc.nextInt();
					if(amount==100) {
						System.out.println("Payment Done");
						System.out.println("Thank You...");
					}else {
						System.out.println("Please enter correct Amount");
					}
					break;
				}
				case 2:{
					System.out.println("Paneer is 170rs");
					System.out.println("Enter the Amount");
					int amount=sc.nextInt();
					if(amount==170) {
						System.out.println("Payment Done");
						System.out.println("Thank You...");
					}else {
						System.out.println("Please enter correct Amount");
					}
					break;
				}
				case 3:{
					System.out.println("Rice dal is 130rs");
					System.out.println("Enter the Amount");
					int amount=sc.nextInt();
					if(amount==130) {
						System.out.println("Payment Done");
						System.out.println("Thank You...");
					}else {
						System.out.println("Please enter correct Amount");
					}
					break;
				}
				}
			}break;
			case 3:{
				System.out.println("1.Pizza     250rs");
				System.out.println("2.Burger    180rs");
				System.out.println("3.French Fries  230rs");
				System.out.println("Enter the choice");
				int select=sc.nextInt();
				
				switch(select) {
				case 1:{
					System.out.println("Pizza is 250rs");
					System.out.println("Enter the Amount");
					int amount=sc.nextInt();
					if(amount==250) {
						System.out.println("Payment Done");
						System.out.println("Thank You...");
					}else {
						System.out.println("Please enter correct Amount");
					}
					break;
				}
				case 2:{
					System.out.println("Burger is 180rs");
					System.out.println("Enter the Amount");
					int amount=sc.nextInt();
					if(amount==180) {
						System.out.println("Payment Done");
						System.out.println("Thank You...");
					}else {
						System.out.println("Please enter correct Amount");
					}
					break;
				}
				case 3:{
					System.out.println("French Fries is 230rs");
					System.out.println("Enter the Amount");
					int amount=sc.nextInt();
					if(amount==230) {
						System.out.println("Payment Done");
						System.out.println("Thank You...");
					}else {
						System.out.println("Please enter correct Amount");
					}
					break;
				}
			}
			
			}
		}
		}
		break;
		case 2 :{
				System.out.println("1.South Indian");
				System.out.println("2.North Indian");
				System.out.println("3.French");
				System.out.println("Enter the choice");
				int pick=sc.nextInt();
				
				switch(pick) {
				case 1:{
					System.out.println("1.Fish Curry	    220rs");
					System.out.println("2.Chicken Kebab	    270rs");
					System.out.println("3.Chicken Shawrma	90rs");
					System.out.println("Enter the choice");
					int select=sc.nextInt();
					
					switch(select) {
					case 1:{
						System.out.println("Fish Curry is 220rs");
						System.out.println("Enter the Amount");
						int amount=sc.nextInt();
						if(amount==220) {
							System.out.println("Payment Done");
							System.out.println("Thank You...");
						}else {
							System.out.println("Please enter correct Amount");
						}
						break;				
					}
					case 2:{
						System.out.println("Chicken Kebab is 270rs");
						System.out.println("Enter the Amount");
						int amount=sc.nextInt();
						if (amount==270) {
							System.out.println("Payment Done");
							System.out.println("Thank You...");
						}else {
							System.out.println("Please enter correct Amount");
						}
						break;
					
					}
					case 3:{
						System.out.println("Chicken Shawrma is 90rs");
						System.out.println("Enter the Amount");
						int amount=sc.nextInt();
						if (amount==90) {
							System.out.println("Payment Done");
							System.out.println("Thank You...");
						}else {
							System.out.println("Please enter correct Amount");
						}
						break;
					}
					}	
				}
				case 2:{
					System.out.println("1.Chicken Biryani    300rs");
					System.out.println("2.Egg Biryani    250rs");
					System.out.println("3.Chicken tikka  280rs");
					System.out.println("Enter the choice");
					int select=sc.nextInt();
					
					switch(select) {
					case 1:{
						System.out.println("Chicken Biryani is 300rs");
						System.out.println("Enter the Amount");
						int amount=sc.nextInt();
						if(amount==300) {
							System.out.println("Payment Done");
							System.out.println("Thank You...");
						}else {
							System.out.println("Please enter correct Amount");
						}
						break;
					}
					case 2:{
						System.out.println("Egg Biryani is 250rs");
						System.out.println("Enter the Amount");
						int amount=sc.nextInt();
						if(amount==250) {
							System.out.println("Payment Done");
							System.out.println("Thank You...");
						}else {
							System.out.println("Please enter correct Amount");
						}
						break;
					}
					case 3:{
						System.out.println("Chicken Tikka is 280rs");
						System.out.println("Enter the Amount");
						int amount=sc.nextInt();
						if(amount==280) {
							System.out.println("Payment Done");
							System.out.println("Thank You...");
						}else {
							System.out.println("Please enter correct Amount");
						}
						break;
					}
					}
				}case 3:{
					System.out.println("1.Chicken Friedrice     320rs");
					System.out.println("2.Egg Friedrice         280rs");
					System.out.println("3.Chicken noodles       350rs");
					System.out.println("Enter the choice");
					int select=sc.nextInt();
					
					switch(select) {
					case 1:{
						System.out.println("Chicken Friedrice is 320rs");
						System.out.println("Enter the Amount");
						int amount=sc.nextInt();
						if(amount==320) {
							System.out.println("Payment Done");
							System.out.println("Thank You...");
						}else {
							System.out.println("Please enter correct Amount");
						}
						break;
					}
					case 2:{
						System.out.println("Egg Friedrice  is 280rs");
						System.out.println("Enter the Amount");
						int amount=sc.nextInt();
						if(amount==280) {
							System.out.println("Payment Done");
							System.out.println("Thank You...");
						}else {
							System.out.println("Please enter correct Amount");
						}
						break;
					}
					
					case 3:{
						System.out.println("Chicken noodles  is 350rs");
						System.out.println("Enter the Amount");
						int amount=sc.nextInt();
						if(amount==350) {
							System.out.println("Payment Done");
							System.out.println("Thank You...");
						}else {
							System.out.println("Please enter correct Amount");
						}
						break;
					}
				}
				}
				}
			}
			
	break;

		default:{
				System.out.println("wrong choice");
			}
		}
	}
}
	

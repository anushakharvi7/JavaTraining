package decstmt;

import java.util.Scanner;
public class Switchprg {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1. Red Rose     30"); 
		System.out.println("2. Barbie Doll  200");
		System.out.println("3. Silk Chocolate  250");
		System.out.println("4. Yellow Rose   50");
		System.out.println("5. Ring         100");
		System.out.println("Enter the choice");
		int choice = sc.nextInt(); 
		
		switch(choice) {
		case 1: {
			System.out.println("Are you my friend");
			System.out.println("1. Yes");
			System.out.println("2. No");
			System.out.println("Enter the option");
			int opt=sc.nextInt();
			
			switch(opt) {
			
			case 1:{
				System.out.println("Enter the password");
				int pass=sc.nextInt();
				
				if(pass==143143) {
					System.out.println("Payment Done");
				}else {
					System.out.println("Wrong Password");
					
				}
				break;
			}
			case 2:{
				
			System.out.println("Red Rose Price is 30rs");
			System.out.println("Enter the Amount");
			int amount = sc.nextInt();
			if (amount>=30) {
				System.out.println("Payment Done");
				System.out.println("Thank You...");
			}
			
			else {
				System.out.println("Enter correct Amount");
			}
			break;
		}
		}
		
				
			
			
			
			
			
			break;
	
	}

		}
	}
}

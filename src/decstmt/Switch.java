package decstmt;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		
		int a=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("1 withdraw");
		System.out.println("2 deposit");
		System.out.println("3 check balance");
		System.out.println("4 exit");
		System.out.println("enter the choice");
		int choice=sc.nextInt();
		
		
		
		switch(choice){
		case 1: {
			System.out.println("withdraw money");
			break;
		}
		case 2: {
			System.out.println("deposit");
			break;
		}
		case 2+1: {
			System.out.println("check balance");
			break;
		}
		case 2+2: {
			System.out.println("exit");
			break;
		}
		default: {
			System.out.println("wrong choice");
			
		}
		}
		
		
	}

}

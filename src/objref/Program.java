package objref;

public class Program {
	public void checkArmstrong(int num) {
		int temp = num;
		int num1 = num;
		int count = 0;
		while(temp != 0) {
			temp /= 10;
			count++;
			
		}
		int sum =0;
		while(num1 != 0) {
			int last =num1%10;
			int pow=1;
			for (int i=1; i<=count;i++) {
				pow = pow*last;
			}
			
			sum+=pow;
			num1/= 10;
			
		}
		System.out.println(sum==num?"Armstrong no":"Not a Armstrong no");
	}
	public static Program objref(){
	return new Program();


	}

}

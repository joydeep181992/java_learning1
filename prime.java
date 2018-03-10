import java.util.Scanner;

class Prime{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number... ");
		int num = input.nextInt();
		boolean IsPrime = true;
		for (int i=2; i<num; i++) {
			if(num%i == 0){
				IsPrime = false;
			}
		}
		if(IsPrime){
			System.out.println("The Given number is a prime number i.e. " + num);
		}
		else{
			System.out.println("Number is not a Prime Number");
		}
	}
}
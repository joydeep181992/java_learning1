import java.util.Scanner;

class CheckPrime{
	private boolean IsPrime = true;	
	public boolean primenumber(int number){	
		for(int i=2; i<number; i++){
			if(number%i == 0){
				IsPrime = false;
			}
		}
		if(IsPrime){
			return true;
		}
		return false;
	}
}

class Prime{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CheckPrime checkprime = new CheckPrime();
		System.out.println("Enter a number to check...");
		int num = input.nextInt();
		if(checkprime.primenumber(num)){
			System.out.println("the given number is a Prime i.e. " + num);	
		}
		else{
			System.out.println("Not Prime retry...");
		}
	}
}
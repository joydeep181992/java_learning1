import java.util.Scanner;

class userInput{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		int number = input.nextInt();
		System.out.println("Hello " + name);
		System.out.println("this is "+ number + " a number");
	}
}
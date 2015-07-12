import java.util.Scanner;

public class InputExample2 {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	while (!input.hasNextInt()){
		input.nextLine();
		System.out.print("Invalid integer; please enter an integer: ");
	}
	int i = input.nextInt();
}
}
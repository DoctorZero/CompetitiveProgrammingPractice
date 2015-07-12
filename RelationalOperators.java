import java.util.*;
import java.io.*;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0;i < t;i++){
			int a=input.nextInt();
			int b=input.nextInt();
			if (a < b) {System.out.println("<");}
			if (a > b) {System.out.println(">");}
			if (a == b) {System.out.println("=");}
		}
		
	}

}

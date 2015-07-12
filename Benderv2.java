import java.io.*;
import java.util.*;

public class Benderv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int L = input.nextInt();
		while (L > 0){
			String end = "+x";
			for (int i = 1; i < L; i++){
				String bend = input.next();
				if (end == "+x"){
					switch (bend) {
					case "No":
						end = "+x";
						break;
					case "+y":
						end = "+y";
						break;
					case "-y":
						end = "-y";
						break;
					case "+z":
						end = "+z";
						break;
					case "-z":
						end = "-z";
						break;
					}
				}
				else if (end == "-x"){
					switch (bend) {
					case "No":
						end = "-x";
						break;
					case "+y":
						end = "-y";
						break;
					case "-y":
						end = "+y";
						break;
					case "+z":
						end = "-z";
						break;
					case "-z":
						end = "+z";
						break;
					}
				}
				else if (end == "+y"){
					switch (bend) {
					case "No":
						end = "+y";
						break;
					case "+y":
						end = "-x";
						break;
					case "-y":
						end = "+x";
						break;
					case "+z":
						end = "+y";
						break;
					case "-z":
						end = "+y";
						break;
					}
				}
				else if (end == "-y"){
					switch (bend) {
					case "No":
						end = "-y";
						break;
					case "+y":
						end = "+x";
						break;
					case "-y":
						end = "-x";
						break;
					case "+z":
						end = "-y";
						break;
					case "-z":
						end = "-y";
						break;
					}
				}
				else if (end == "+z"){
					switch (bend) {
					case "No":
						end = "+z";
						break;
					case "+y":
						end = "+z";
						break;
					case "-y":
						end = "+z";
						break;
					case "+z":
						end = "-x";
						break;
					case "-z":
						end = "+x";
						break;
					}
				}
				else if (end == "-z"){
					switch (bend) {
					case "No":
						end = "-z";
						break;
					case "+y":
						end = "-z";
						break;
					case "-y":
						end = "-z";
						break;
					case "+z":
						end = "+x";
						break;
					case "-z":
						end = "-x";
						break;
					}
				}
			}
			System.out.println(end);
			L = input.nextInt();
		}
	}

}

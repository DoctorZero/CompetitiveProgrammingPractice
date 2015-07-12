import java.util.*;
import java.io.*;

public class TheSnail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		double H = input.nextDouble();
		while (H > 0){
			double U = input.nextDouble();
			double D = input.nextDouble();
			double F = input.nextDouble();
			double I = 0;
			double AC = 0;
			double AD = 0;
			int day = 0;
			while (I < H){
				if (U*(1-F/100*day) > 0){
					AC = I + U*(1-F/100*day);
				}
				else{
					AC = I;
				}
				if (AC > H){
					System.out.println("success on day " + (day+1));
					break;
				}
				AD = AC - D;
				I = AD;
				if (I < 0){
					System.out.println("failure on day " + (day+1));
					break;
				}
				day++;
			}
			H = input.nextDouble();
		}
	}

}

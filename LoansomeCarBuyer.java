import java.io.*;
import java.util.*;
public class LoansomeCarBuyer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while (t > 0){
			double downpay = input.nextDouble();
			double total = input.nextDouble();
			double month = total/(double)t;
			int change = input.nextInt();
			int change_month[] = new int[change];
			double rate[] = new double[change];
			double r = 0;
			for (int i = 0; i < change; i++){
				change_month[i] = input.nextInt();
				rate[i] = input.nextDouble();
			}
			double loan = total;
			double value = total + downpay;
			for (int j = 0; j <= t; j++){
				for (int k = 0; k < change; k++){
					if (j >= change_month[k] && k == change - 1){
						r = rate[k];
						break;
					}
					else if (j >= change_month[k] && j < change_month[k+1]){
						r = rate[k];
						break;
					}
				}
				
				value = (1 - r) * value;
				
				if (loan < value && j == 1){
					System.out.println(j + " month");
					break;
				}
				else if (loan < value && j != 1){
					System.out.println(j + " months");
					break;
				}
				
				loan = loan - month;
			}
			
			t = input.nextInt();
		}
	}

}

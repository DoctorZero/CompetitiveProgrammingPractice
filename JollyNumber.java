import java.io.*;
import java.util.*;
import java.math.*;
class JollyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		while (input.hasNext()){// do not assume n is just less than 0, should use this if you meet end of file.
			int n = input.nextInt();
			boolean Jolly = true;
			int[] num = new int [n];
			int[] diff = new int [n-1];
			for (int i = 0; i < n; i++){
				num[i] = input.nextInt();
			}
			
			for (int j = 0; j < n-1; j++){
				diff[j]=Math.abs(num[j+1] - num[j]);
			}
			
			Arrays.sort(diff);
			
			for (int k = 0; k < n-1; k++){
				if (diff[k] != k+1) {
					Jolly = false;
				}
			}

			if (Jolly){
				System.out.println("Jolly");
			}
			else{
				System.out.println("Not jolly");
			}
		}
	}
}

import java.io.*;
import java.util.*;

class Newspaper {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for (int p = 1; p <= N; p++){
			int K = input.nextInt();
			String[] val_char = new String[K+1];
			int[] unit_pri = new int[K+1];
			int sum = 0;
			for (int i = 1; i <= K; i++){
				val_char[i] = input.next();
				unit_pri[i] = input.nextInt();
			}
			int M = input.nextInt();
			input.nextLine();
			String[] text = new String[M+1];
			for (int j = 1; j <= M; j++){
				text[j] = input.nextLine();
			}
			int[] count = new int [K+1];
			for (int i = 1; i <= K; i++){
				char val = val_char[i].charAt(0);
				for (int j = 1; j <= M; j++){
					char[] text_char = text[j].toCharArray();
					for (int k = 0; k <= text_char.length-1; k++){
						if (text_char[k] == val){
							count[i]++;
						}
					}
				}
				sum += count[i]*unit_pri[i];
			}
			double pay = (double)sum/100.0;
			System.out.format("%.2f$%n",pay);
		}
	}
}

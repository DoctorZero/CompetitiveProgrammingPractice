import java.io.*;
import java.util.*;

public class HorrorDash {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		int M = 0;
		for (int i = 0; i < T; i++){
			int N = input.nextInt();
			for (int j = 0; j < N; j++){
				int a = input.nextInt();
				if (a > M){
					M = a;
				}
			}
			System.out.println("Case " + (i+1) +": " + M);
			M = 0;
		}
	}

}

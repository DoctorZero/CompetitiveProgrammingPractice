import java.util.*;
import java.io.*;

public class EventPlanning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		while(N > 0){
			int B = input.nextInt();
			int H = input.nextInt();
			int W = input.nextInt();
			int[][] hpw = new int[H][W+1];
			int total = 0;
			int mini = Integer.MAX_VALUE;
			int cost = Integer.MAX_VALUE;
			boolean flag = true;
			boolean flag2 = false;
			for (int i = 0; i < H; i++){
				for(int j = 0; j <= W; j++){
					flag = true;
					hpw[i][j]=input.nextInt();
					if (j > 0 && hpw[i][j] < N){
						flag = false;
					}
					else if (j > 0 && hpw[i][W] >= N){
						total = hpw[i][0] * W;
					}
					if (flag && mini > total && j == W){
						mini = total;
						cost = mini * N;
					}
					flag2 = flag2||flag;
				}
			}
			if (cost > B){
				System.out.println("stay home");
			}
			else if (!flag2){
				System.out.println("stay home");
			}
			else{
				System.out.println(cost);
			}
			N = input.nextInt();
		}
	}

}

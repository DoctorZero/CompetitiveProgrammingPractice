import java.util.*;
import java.io.*;


public class CostCutting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		int[] list = new int[3];
		for (int i = 1 ; i <= T; i++){
			list[0] = input.nextInt();
			list[1] = input.nextInt();
			list[2] = input.nextInt();
			Arrays.sort(list);
			int survive = list [1];
			System.out.println("Case " + i + ": " + survive);
		}
	}

}

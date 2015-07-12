import java.io.*;
import java.util.*;

public class ArmyBuddies {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer (input.readLine());
		int S = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		while (S != 0 && B != 0){
			boolean[] line = new boolean [S+2];
			for (int i = 0; i <= B; i++){
				int L = Integer.parseInt(st.nextToken());
				int R = Integer.parseInt(st.nextToken());
			
			}
			System.out.println("-");
			S = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
		}
	}

}

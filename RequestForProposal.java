import java.io.*;
import java.util.*;

public class RequestForProposal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();
		int p = input.nextInt();
		int count = 0;
		while (n != 0 && p != 0){
			String[] Topic = new String [n+1];
			String[][] Proposal = new String [p+1][n+1];
			double[] Budget = new double [p+1];
			int[] Partial = new int[p+1];
			double[] compliance = new double [p+1];
			String pname = null;
			input.nextLine();
			for (int i = 1; i <= n; i++){
				Topic[i] = input.nextLine(); //need to change maybe buffered reader
			}
			double max_compliance = 0.0;
			double min_budget = 0.0;
			for (int j = 1; j <= p; j++){
				Proposal[j][0] = input.nextLine();//need to change maybe buffered reader
				Budget[j] = input.nextDouble();
				Partial[j] = input.nextInt();
				compliance[j] = (double) Partial[j]/ (double) n;
				input.nextLine();
				for (int k = 1; k <= Partial[j]; k++){
					Proposal[j][k] = input.nextLine();
				}
				if (compliance[j] > max_compliance){
					max_compliance = compliance[j];
					min_budget = Budget[j];
					pname = Proposal[j][0];
				}
				else if ((compliance[j] - max_compliance) < 0.000000001 && (compliance[j] - max_compliance) > -0.000000001 ){
					if (Budget[j] < min_budget){
						pname = Proposal[j][0];
						min_budget = Budget[j];
					}
				}
				
			}
			count++;
			System.out.println("RFP #" + count + "\n" + pname);
			n = input.nextInt();
			p = input.nextInt();
			if (n!= 0 && p!= 0){
				System.out.println("");
			}
		}
	}
}

import java.io.*;
import java.util.*;

public class BenderBRdriguezProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int L = input.nextInt();
		while (L > 0){
			int pos_ycount = 0;
			int neg_ycount = 0;
			int pos_zcount = 0;
			int neg_zcount = 0;
			String end = "+x";
			for (int i = 0; i < L-1; i++){
				String first = input.next();
				if (input.next() == "+y" && i >0){
					pos_ycount++;
				}
				if (input.next() == "-y" && i > 0){
					neg_ycount++;
				}
				if (input.next() == "+z" && i > 0){
					pos_zcount++;
				}
				if (input.next() == "-z" && i > 0){
					neg_zcount++;
				}
				
				int pos_y = pos_ycount % 4;
				int neg_y = neg_ycount % 4;
				int pos_z = pos_zcount % 4;
				int neg_z = neg_zcount % 4;
				
				int net_y = pos_y - neg_y;
				int net_z = pos_z - neg_z;
				
				if (first == "No"){
				
				}else if (first == "+y"){
					
				}else if (first == "-y"){
					
				}else if (first == "+z"){
					
				}else if (first == "-z"){
					
				}
				
				
					
				
			}
		}
	}

}

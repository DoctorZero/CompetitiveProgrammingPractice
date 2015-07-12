import java.util.*;
import java.io.*;

public class DivisionOfNlogonia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);	
		int k = input.nextInt();
		while ( k!= 0){
			int n = input.nextInt();
			int m = input.nextInt();
			for (int i = 1; i < k+1 ; i++){
				int a = input.nextInt();
				int b = input.nextInt();
				if (a > n){
					if (b > m){
						System.out.println("NE");
					}
					else if (b < m) {
						System.out.println("SE");
					}
					else if (b == m){
						System.out.println("divisa");
					}
				}
				else if (a < n){
					if (b > m){
						System.out.println("NO");
					}
					else if (b < m){
						System.out.println("SO");
					}
					else if (b == m){
						System.out.println("divisa");
					}
				}
				else if (a == n){
					System.out.println("divisa");
				}
				
			}
			k = input.nextInt();
		}
	}
}

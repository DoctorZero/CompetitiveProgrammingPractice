import java.io.*;
import java.util.*;

class Newspaperv2 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
//		BufferedWriter output = new BufferedWriter(new OutputStreamWriter (System.out));
		int N = Integer.parseInt(input.readLine());
		for (int p = 1; p <= N; p++){
			int K = Integer.parseInt(input.readLine());
			HashMap<Character,Integer> value_char = new HashMap<Character,Integer>();
			value_char.clear();
			long sum = 0;
			for (int i = 1; i <= K; i++){
				StringTokenizer st = new StringTokenizer (input.readLine());
				value_char.put(st.nextToken().charAt(0), Integer.parseInt(st.nextToken()));
			}
			int M = Integer.parseInt(input.readLine());
			for (int j = 1; j <= M; j++){
				char[] text_char = input.readLine().toCharArray();
				for (int k = 0; k <= text_char.length-1;k++){
					if(value_char.containsKey(text_char[k])){
						sum += value_char.get(text_char[k]);
					}
				}
			}
			double pay = (double)sum/100.0;
			System.out.format("%.2f$%n",pay);
		}
	}
}

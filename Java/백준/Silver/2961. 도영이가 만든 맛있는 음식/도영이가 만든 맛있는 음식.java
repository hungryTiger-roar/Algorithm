import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[] sours = new int[N];
		int[] bitters = new int[N];
		
		for (int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			sours[i] = Integer.parseInt(st.nextToken());
			bitters[i] = Integer.parseInt(st.nextToken());
			
		}
		
		long min = Integer.MAX_VALUE;
		
		for (int mask = 1; mask < (1 << N); mask++) {
			
			long sourSum = 1L;
			long bitterSum = 0L;
			
			for (int j = 0; j < N; j++) {
				
				if ((mask & (1 << j)) != 0) {
					
					sourSum = sourSum * sours[j];
					bitterSum = bitterSum + bitters[j];
					
				}
				
			}
			
			long calc = Math.abs(sourSum - bitterSum);
			
			if (min > calc) {
				
				min = calc;
				
			}
			
		}
		
		bw.write(String.valueOf(min));
		
		bw.flush();
		bw.close();
		br.close();
	}

}
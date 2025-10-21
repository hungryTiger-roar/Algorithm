import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=0; tc<T; tc++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			// 원하는 상황
//			int result = (M-N)!/N!;

			long up = 1; // 구현하고 싶은 분자
			long down = 1; // 구현하고 싶은 분모
			int other = M-N; 
			if(other<N) N = other; // 계산 줄이기 위함
			
			// 팩토리얼 구현
			while(N>0)
			{
				up *= M--;
				down *= N--;
			}
			long result = up/down;
			sb.append(result).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
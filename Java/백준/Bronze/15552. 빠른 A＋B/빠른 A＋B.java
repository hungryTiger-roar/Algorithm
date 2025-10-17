import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		for(int i=0; i<T; i++)
		{
			st = new StringTokenizer(br.readLine());
			int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			bw.write(sum + "\n"); // 버퍼드라이터에 추가! 행바꿈은 "\n"로~
		}
		bw.flush(); // 전체 출력
		bw.close(); // 마지막으로 닫기
	}
}
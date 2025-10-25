import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int X = Integer.parseInt(br.readLine());
		
		int first = 0; // 분자
		int second = 1; // 분모
		int step = 0; // 대각선 기준 1 이외의 수
		
		for(int i=0; i<X; i++)
		{
			if(step % 2 == 1) // 1/2, 1/4, ... 일 땐 분자를 +1 분모를 -1
			{
				if(second == step) // step=1일 때 1/1, step=3일 때 1/3, ... 
				{
					step++;
					second = step; // 1/1일 때 1/2로, 1/3일 때 1/4로, ...
					continue;
				}
				first--;
				second++;
			}
			else if(step % 2 == 0) // 3/1, 5/1, ... 일 땐 분자를 -1 분모를 +1
			{
				if(first == step) // step=2일 때 2/1, step=4일 때 4/1, ... 
				{
					step++;
					first = step; // 2/1일 때 3/1로, 4/1일 때 5/1로, ...
					continue;
				}
				first++;
				second--;
			}
		}
		sb.append(first).append("/").append(second);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
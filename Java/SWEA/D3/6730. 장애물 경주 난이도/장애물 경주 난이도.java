import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for(int x=1; x<=T; x++)
		{
			// 입력받기
			int N = Integer.parseInt(br.readLine());
			String[] input = br.readLine().split(" ");
			
			int upMax = 0; // 올라갈 때 가장 심한 높이 변화
			int downMax = 0; // 내려갈 때 가장 심한 높이 변화
			for(int i=1; i<N; i++)
			{
				int prev = Integer.parseInt(input[i-1]);
				int next = Integer.parseInt(input[i]);
				
				if(prev < next) upMax = Math.max(upMax, next-prev);
				if(prev > next) downMax = Math.max(downMax, prev-next);
			}
			sb.append("#").append(x).append(" ").append(upMax).append(" ").append(downMax).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
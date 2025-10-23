import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for(int t=1; t<=T; t++)
		{
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			// 각 점수마다 몇 명의 학생이 받았는지
			int[] scores = new int[101]; // 0~100점까지
			for(int i=0; i<1000; i++)
			{
				scores[Integer.parseInt(st.nextToken())]++;
			}
			
			// 최빈수 구하기
			int result = -1; // 출력해야하는 최빈수(가장 많이 나온 수)
			int max = 0; // 가장 많이 나온 횟수
			for(int i=0; i<scores.length; i++)
			{
				if(scores[i] >= max)
				{
					result = i;
					max = scores[i];
				}
			}
			sb.append("#").append(N).append(" ").append(result).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
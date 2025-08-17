import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static int[] num;
	static int[] result;

	static StringBuilder sb = new StringBuilder();
	
	// 조합 함수 만들기
	static void comb(int depth, int numIdx) {
		if(depth == M)
		{
			for(int i=0; i<result.length; i++)
			{
				sb.append(result[i]).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i=numIdx; i<num.length; i++)
		{
			result[depth] = num[i];
			comb(depth+1, i+1);
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		// 숫자배열
		num = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++)
		{
			num[i] = Integer.parseInt(st.nextToken());
		}
		// sort
		Arrays.sort(num);
		
		// 결과 배열
		result = new int[M];
		
		// 조합 함수 실행
		comb(0,0);
		
		// StringBuilder 한번에 출력
		System.out.println(sb);
	}
}
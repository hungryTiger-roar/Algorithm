import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	// 중복 순열
	static int N;
	static int M;
	static int[] num;
	static int[] result;
	
	static StringBuilder sb = new StringBuilder();
	
	static void dupPerm(int depth)
	{
		if(depth == M)
		{
			for(int i=0; i<result.length; i++)
			{
				sb.append(result[i]).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i=0; i<num.length; i++)
		{
			result[depth] = num[i];
			dupPerm(depth+1);
		}
	}
	
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		// 숫자배열 알아내기
		num = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++)
		{
			num[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num);
		
		// 결과 배열
		result = new int[M];
		
		// 중복 순열 함수 실행
		dupPerm(0);
		
		// 한번에 출력
		System.out.print(sb);
	}
}
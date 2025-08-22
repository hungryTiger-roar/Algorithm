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
	
	
	// 중복순열 함수
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
		
		int before = 0;
		for(int i=0; i<num.length; i++)
		{
			if(before != num[i])
			{
				result[depth] = num[i];
				dupPerm(depth+1);
				before = num[i];
			}
		}
	}
	
	public static void main(String[] args) throws IOException{

		// 스캐너는 시간초과
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		// 숫자배열
		st = new StringTokenizer(br.readLine());
		num = new int[N];
		for(int i=0; i<num.length; i++)
		{
			num[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num);
		
		// 결과배열
		result = new int[M];
		
		// 중복순열 함수 실행
		dupPerm(0);
		
		// 한번에 출력
		System.out.print(sb);
	}
}
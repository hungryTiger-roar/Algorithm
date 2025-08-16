import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.naming.ldap.StartTlsRequest;

public class Main {
	// 중복조합
	static int N;
	static int M;
	static int[] num;
	static int[] result;
	
	static StringBuilder sb = new StringBuilder();
	
	
	// 중복조합 함수 만들기
	static void dupComb(int depth, int numIdx)
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
		
		for(int i=numIdx; i<num.length; i++)
		{
			result[depth] = num[i];
			dupComb(depth+1, i);
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		// 숫자 배열 0~N
		num = new int[N+1];
		for(int i=0; i<=N; i++)
		{
			num[i] = i;
		}
		
		// 결과 배열
		result = new int[M];
		
		// 중복조합 함수 실행
		dupComb(0,1);
		
		// StringBuilder로 한 번에 출력
		System.out.print(sb);
	}
}
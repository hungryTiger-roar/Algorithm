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
	static boolean[] visited;
	
	static StringBuilder sb = new StringBuilder();
	
	
	// 순열 함수 만들기
	static void perm(int depth)
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
			if(!visited[i])
			{
				visited[i] = true;
				result[depth] = num[i];
				perm(depth+1);
				visited[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		// 입력 받은 숫자 숫자배열에 넣고 오름차순으로 정리
		num = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++)
		{
			num[i] = Integer.parseInt(st.nextToken());
		}
		// 배열 오름차순 정리 방법!!!!
		Arrays.sort(num);
		
		
		// 결과 배열 만들기
		result = new int[M];
		// 방문여부 배열 만들기
		visited = new boolean[N];
		
		
		// 순열 함수 실행
		perm(0);
		
		// StringBuilder를 이용해서 한 번에 출력
		System.out.print(sb);
	}
}
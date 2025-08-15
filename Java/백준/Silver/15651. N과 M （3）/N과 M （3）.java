import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	
	static int[] num;
	static int[] result;
	// 출력 속도를 위해 StringBiulder 추가
	static StringBuilder sb = new StringBuilder();
	
	// 중복순열 함수 만들기
	static void dupPerm(int depth) {
		if(depth == M)
		{
			for(int i=0; i<result.length; i++)
			{
//				System.out.print(result[i] + " ");
				sb.append(result[i]).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i=1; i<num.length; i++)
		{
			result[depth] = num[i];
			dupPerm(depth+1);
		}
	}
	
	
	public static void main(String[] args) throws IOException{
		// 스캐너 시간초과
//		Scanner sc = new Scanner(System.in);
//		String[] input = sc.readLine().split(" ");

//		N = Integer.parseInt(input[0]);
//		M = Integer.parseInt(input[1]);

		// 입력 속도를 위해 BufferedReader & StringTokenizer 추가
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		// num => 숫자배열 0~N
		num = new int[N+1];
		for(int i=0; i<N+1; i++)
		{
			num[i] = i;
		}
		// result => 결과배열
		result = new int[M];
		
		// 중복 순열 함수 실행
		dupPerm(0);
		
		// 출력을 위해 추가한 StringBiulder 출력하는 코드
		// 한 번에 출력
		System.out.print(sb);
	}
}
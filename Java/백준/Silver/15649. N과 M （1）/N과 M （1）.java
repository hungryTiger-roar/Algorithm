import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	
	static int[] num;
	static boolean[] visited;
	static int[] result;
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// N, M 입력 받아오기
		String[] input = sc.nextLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		
		num = new int[N+1];
		visited = new boolean[num.length];
		result = new int[M];
		
		// num 배열 채워주기 (0)1~N
		for(int i=0; i<=N; i++)
		{
			num[i] = i;
		}
		
		perm(0);
	}
	
	// 순열 함수 만들기
	static void perm(int depth)
	{
		if(depth == M)
		{
			for(int i=0; i<result.length; i++)
			{
				System.out.print(result[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=1; i<=N; i++)
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
}

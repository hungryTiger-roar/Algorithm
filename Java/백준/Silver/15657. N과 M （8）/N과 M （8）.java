import java.util.Arrays;
import java.util.Scanner;

public class Main {
	// 중복조합
	static int N;
	static int M;
	static int[] num;
	static int[] result;
	
	
	static void dupComb(int depth, int numIdx)
	{
		if(depth == M)
		{
			for(int i=0; i<result.length; i++)
			{
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=numIdx; i<num.length; i++)
		{
			result[depth] = num[i];
			dupComb(depth+1, i);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split(" ");

		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		
		// 숫자배열
		input = sc.nextLine().split(" ");
		num = new int[N];
		
		for(int i=0; i<N; i++)
		{
			num[i] = Integer.parseInt(input[i]);
		}
		Arrays.sort(num);
		
		// 결과배열
		result = new int[M];
		
		// 중복배열 실행
		dupComb(0,0);
		
	}
}
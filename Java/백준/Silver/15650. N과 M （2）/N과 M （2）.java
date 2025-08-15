import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static int[] num;
	static int[] result;
	
	public static void comb(int depth, int numIdx)
	{
		if(depth == M)
		{
			for(int i=0; i<result.length; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}
		
		// 1부터 N까지!!
		for(int i=numIdx; i<num.length; i++)
		{
			result[depth] = num[i];
			// i+1로 중복 방지!!!!!!!!!!!!!!
			comb(depth+1, i+1);
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		
		// 숫자 배열 채우기 0~N
		num = new int[N+1];
		for(int i=0; i<num.length; i++)
		{
			num[i] = i;
		}
		// 결과 배열 만들기
		result = new int[M];
		
		comb(0,1);
	}
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static int[] num;
	static int[] result;
	
	// 조합 함수
	static void comb(int depth, int numIdx)
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
		
		// 같은 결과 중복 없애기 위한 임의의 수 설정(입력으로 주어지는 수는 10,000보다 작거나 같은 자연수)
		int before = 0;
		for(int i=numIdx; i<num.length; i++)
		{
			if(num[i] != before)
			{
				result[depth] = num[i];
				before = num[i];
				comb(depth+1, i+1);
			}
		}
	}
	
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	
    	String[] input = sc.nextLine().split(" ");
    	N = Integer.parseInt(input[0]);
    	M = Integer.parseInt(input[1]);
    	
    	input = sc.nextLine().split(" ");
    	
    	// 숫자 배열
    	num = new int[N];
    	for(int i=0; i<num.length; i++)
    	{
    		num[i] = Integer.parseInt(input[i]);
    	}
    	Arrays.sort(num);
    	
    	// 결과 배열
    	result = new int[M];
    	
    	
    	// 조합 함수 실행
    	comb(0,0);
    	
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int L;
	static int C;
	static String[] array;
	static String[] result;
	
	static int cntAeiou = 0;
	static int cntOther = 0;
	
	// 조합 함수
	static void comb(int depth, int arrayIdx)
	{
		if(depth == L)
		{
			// 모음과 자음 개수 세기
			for(int i=0; i<result.length; i++)
			{
				if(result[i].equals("a") || result[i].equals("e")|| result[i].equals("i") || result[i].equals("o") || result[i].equals("u")) 
				{
					cntAeiou++;
				}
				else
				{
					cntOther++;
				}
			}
			// 모음이 한 개 이상 자음이 두 개 이상인 경우만 출력
			if(cntAeiou>=1 && cntOther>=2)
			{
				for(int i=0; i<result.length; i++)
				{
					System.out.print(result[i]);
				}
				System.out.println();
			}
			// 출력 후 모음, 자음 갯수 초기화
			cntAeiou = 0;
			cntOther = 0;
			return;
		}
		
		
		for(int i=arrayIdx; i<array.length; i++)
		{
			result[depth] = array[i];
			comb(depth+1, i+1);
		}
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split(" ");
		L = Integer.parseInt(input[0]);
		C = Integer.parseInt(input[1]);
		
		// 입력 받은 문자 배열
		input = sc.nextLine().split(" ");
		array = new String[C];
		for(int i=0; i<array.length; i++)
		{
			array[i] = input[i];
		}
		Arrays.sort(array);
		
		// 결과 배열
		result = new String[L];
		
		// 조합 함수 실행
		comb(0,0);
	}
}
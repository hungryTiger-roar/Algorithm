import java.util.Scanner;

public class Main {
	static int N, M, result;
	static int[] cards;
	static int[] pick;
	
	// 조합 함수로 3가지 뽑기 + 최대한 가까운 카드 3장의 합 구하기
	static void comb(int depth, int start)
	{
		if(depth == 3)
		{
			int sum = 0;
			// 뽑은 3장의 카드의 합
			for(int i=0; i<pick.length; i++) sum += pick[i];
			
			// M을 넘지않고 M에 최대한 가까운(즉, 가장 큰) 카드 3장의 합 구하기
			if(sum <= M) result = Integer.max(result, sum);
		
			return;
		}
		
		for(int i=start; i<cards.length; i++)
		{
			pick[depth] = cards[i];
			comb(depth+1, i+1);
		}
	}
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] input = sc.nextLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        // 카드 배열 초기화
        cards = new int[N];
        input = sc.nextLine().split(" ");
        for (int i = 0; i < cards.length; i++) {
        	cards[i] = Integer.parseInt(input[i]);
        }
        // 고른 카드 배열 초기화
        pick = new int[3];
        // 합 초기화
        result = 0;
        
        // 함수 실행
        comb(0,0);
        // 출력
        System.out.println(result);
    }
}
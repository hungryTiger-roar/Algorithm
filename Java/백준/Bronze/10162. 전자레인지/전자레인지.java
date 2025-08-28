import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 전자레인지 버튼
		int[] abc = {300, 60, 10};
		
		// 입력 받은 시간
		int T = Integer.parseInt(st.nextToken());
		
		// 제시된 3개의 버튼으로 T초를 맞출 수 없는 경우
		if(T % 10 != 0)
		{
			System.out.println(-1);
		}
		else
		{
            // 현재 남은 초
			int currentNum = T;
			for(int i : abc) {
				System.out.print((currentNum / i) + " ");
				currentNum %= i;
			}
		}
	}
}
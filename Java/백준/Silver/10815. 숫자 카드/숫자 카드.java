import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		// N
		int N = Integer.parseInt(st.nextToken());
		// 상근이가 가지고 있는 숫자 카드 Set (Set의 .contains를 사용하기 위함!)
		Set<Integer> cards = new HashSet<Integer>();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) cards.add(Integer.parseInt(st.nextToken()));
		
		// M
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++)
		{
			int num = Integer.parseInt(st.nextToken());
			if(cards.contains(num)) sb.append("1 "); // 상근이가 가지고 있다면 sb에 "1 " 추가
			else sb.append("0 "); // 가지고 있지 않다면 sb에 "0 "추가
		}
		System.out.println(sb);
	}
}
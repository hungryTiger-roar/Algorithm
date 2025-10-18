import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 듣도 못한 사람 Set (Set의 .contains를 이용하기 위함!)
		Set<String> neverHeard = new HashSet<String>();
		for(int i=0; i<N; i++) neverHeard.add(br.readLine());

		// 보도 못한 사람과 듣도 못한 사람이 일치하는 경우 듣보잡(neigher) PriortyQueue에 넣기 (우선순위큐의 자동정렬 기능과 .poll 이용하기 위함!)
		PriorityQueue<String> neigher = new PriorityQueue<String>();
		for(int i=0; i<M; i++)
		{
			String neverSeen = br.readLine();
			if(neverHeard.contains(neverSeen)) neigher.add(neverSeen);
		}
		
		System.out.println(neigher.size());
		while(!neigher.isEmpty()) System.out.println(neigher.poll());
	}
}
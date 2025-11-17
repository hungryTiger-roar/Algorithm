import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0}; // 상하좌우
	static int[] dy = {0, 0, -1, 1};
	
	static void bfs()
	{
		Queue<int[]> q = new LinkedList<>(); // 큐생성
		q.offer(new int[]{0,0}); // 시작점 큐에 넣기
		visited[0][0] = true; // 시작점 방문처리
		
		while(!q.isEmpty()) // 큐가 비어있게 될 때까지 반복
		{
			int[] cur = q.poll();
			
			for(int i=0; i<4; i++)
			{
				int nx = cur[0] + dx[i];
				int ny = cur[1] + dy[i];
				
				if(nx>=0 && nx<N && ny>=0 && ny<M // 맵의 범위 안벗어나기
						&& map[nx][ny] == 1 && !visited[nx][ny]) // 길이고, 방문하지 않은 곳
				{
					map[nx][ny] = map[cur[0]][cur[1]] + 1; // 옮기기 전 자리에서 +1 해주기
					q.offer(new int[] {nx, ny});
					visited[nx][ny] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		// 초기화
		map = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i=0; i<N; i++)
		{
			String input = br.readLine();
			for(int j=0; j<M; j++)
			{
				map[i][j] = input.charAt(j)-'0';
			}
		}
		
		bfs();
		
		sb.append(map[N-1][M-1]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Solution
{
	static int[][] map;
	static boolean[][] visited;
	static int[] start, end; // 시작점, 끝점 좌표 
	static int[] dx = {-1, 1, 0, 0}; // 상하좌우
	static int[] dy = {0, 0, -1, 1};
	static int ans;
	
	static void bfs()
	{
		Queue<int[]> q = new LinkedList<>();
		q.offer(start);
		visited[start[0]][start[1]] = true;
		
		while(!q.isEmpty())
		{
			int[] cur = q.poll();
			int cx = cur[0];
			int cy = cur[1];
			
			for(int i=0; i<4; i++)
			{
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				
				if(nx>=0 && nx<16 && ny>=0 && ny<16
						&& map[nx][ny] != 1 && !visited[nx][ny])
				{
					if(nx == end[0] && ny == end[1]) ans = 1;
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
		
		for(int t=0; t<10; t++)
		{
			// 초기화하기
			map = new int[16][16];
			visited = new boolean[16][16];
			start = new int[2];
			end = new int[2];
			ans = 0;
			// 입력받기
			int T = Integer.parseInt(br.readLine());
			for(int i=0; i<map.length; i++)
			{
				String input = br.readLine();
				for(int j=0; j<map[i].length; j++)
				{
					map[i][j] = input.charAt(j) - '0'; // String => char => int
					// 시작 좌표 저장
					if(map[i][j] == 2)
					{
						start[0] = i;
						start[1] = j;
					}
					// 끝 좌표 저장
					if(map[i][j] == 3)
					{
						end[0] = i;
						end[1] = j;
					}
				}
			}
			// 함수실행
			bfs();
			sb.append("#").append(T).append(" ").append(ans).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
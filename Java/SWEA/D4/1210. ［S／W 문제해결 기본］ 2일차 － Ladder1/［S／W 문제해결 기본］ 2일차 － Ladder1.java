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
	static int endX, endY; // 도착지점 X, Y좌표
	static int[] dx = {-1, 1, 0}; // 좌, 우, 상
	static int[] dy = {0, 0, -1}; // 아래서부터 올라갈거기 때문에 하는 필요없다!!!
	static int ans; // 출발점의 x좌표
	
	static void dfs(int x, int y)
	{
		if(y == 0) // 시작점 도착
		{
			ans = x;
			return;
		}
		visited[x][y] = true;
		
		for(int i=0; i<2; i++)
		{
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx>=0 && nx<100 && ny>=0 && ny<100 // 1. 범위 안벗어나고
					&& map[nx][ny] == 1 && !visited[nx][ny]) //2. 사다리(1)고 3. 방문 안했어야함
			{
				dfs(nx,ny);
				return; // 좌우로 이동했으면 다른 방향 탐색을 막는 역할
			}
		}
		// 좌우가 사다리가 아닌경우 위로 이동
		int nx = x + dx[2];
		int ny = y + dy[2];
		
		if(nx>=0 && nx<100 && ny>=0 && ny<100 // 1. 범위 안벗어나고
				&& map[nx][ny] == 1 && !visited[nx][ny]) //2. 사다리(1)고 3. 방문 안했어야함
		{
			dfs(nx,ny);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		for(int tc=1; tc<=10; tc++)
		{
			int T = Integer.parseInt(br.readLine());
			// 초기화
			map = new int[100][100];
			visited = new boolean[100][100];
			endX = -1;
			endY = -1;
			ans = -1;
			
			for(int i=0; i<100; i++)
			{
				String[] input = br.readLine().split(" ");
				for(int j=0; j<100; j++)
				{
					map[j][i] = Integer.parseInt(input[j]); // 문제 설정 상 가로가 X좌표이기 때문!
					if(map[j][i] == 2)
					{
						endX = j;
						endY = i;
					}
				}
			}
			dfs(endX, endY);
			sb.append("#").append(T).append(" ").append(ans).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
import java.io.*;
import java.util.*;

public class Main {
	
	static int N;
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		
		arr = new int[N][N];
		
		visited = new boolean[N][N];
		
		for (int i = 0; i < N; i++) {
			
			String line = br.readLine();
			
			for (int j = 0; j < N; j++) {
				
				arr[i][j] = Character.getNumericValue(line.charAt(j));
				
			}
			
		}
		
		int cnt = 0;
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			
			for (int j = 0; j < N; j++) {
				
				if (!visited[i][j] && arr[i][j] == 1) {
					
					int dangi = dfs(i, j);
					
					cnt++;
					
					al.add(dangi);
					
				}
			}
		}
		
		Collections.sort(al);
		
		bw.write(cnt + "\n");
		
		for (int num : al) {
			
			bw.write(num + "\n");
		
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	static int dfs(int x, int y) {
		
		int cnt = 1;
		
		visited[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			
			int newX = x + dx[i];
			int newY = y + dy[i];
			
			if (newX < 0 || newX >= N || newY < 0 || newY >= N) continue;
			
			if (!visited[newX][newY] && arr[newX][newY] == 1) {
				cnt = cnt + dfs(newX, newY);
			}
		}
		
		return cnt;
	}

}
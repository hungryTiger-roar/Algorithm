import java.io.*;
import java.util.*;

public class Main {
	
	static char[][] arr;
	static Set<Character> set;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int max;
	static int R;
	static int C;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		arr = new char[R][C];
		max = 0;
		
		for (int i = 0; i < R; i++) {
			
			String line = br.readLine();
			
			for (int j = 0; j < C; j++) {
				
				arr[i][j] = line.charAt(j);
								
			}
						
		}
		
		set = new HashSet<>();
		
		dfs (0, 0, 1);
		
		bw.write(String.valueOf(max));
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	static void dfs(int x, int y, int cnt) {
		
		set.add(arr[x][y]);
		
		if (max < cnt) {
			
			max = cnt;
			
		}
		
		for (int i = 0; i < 4; i++) {
			
			int newX = x + dx[i];
			int newY = y + dy[i];
			
			if (newX < 0 || newX >= R || newY < 0 || newY >= C) continue;
			
			if (arr[newX][newY] != arr[x][y]) {
				
				if (!set.contains(arr[newX][newY])) {
					dfs(newX, newY, cnt+1);
				}
				
			}
			
		}
		
		set.remove(arr[x][y]);

		
	}

}
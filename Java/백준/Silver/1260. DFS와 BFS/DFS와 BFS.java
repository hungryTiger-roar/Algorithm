import java.io.*;
import java.util.*;

public class Main {
	
	static List<List<Integer>> graph;
	static Queue<Integer> queue;
	static boolean[] visited;
	static int index;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList<>();
		visited = new boolean[N+1];
		index = 0;
		
		for (int i = 0; i <= N; i++) {
			
			graph.add(new ArrayList<>());
			
		}
		
		for (int i = 0; i < M; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph.get(u).add(v);
			graph.get(v).add(u);
			
		}
		
		for (int i = 1; i <= N; i++) {
			
			Collections.sort(graph.get(i));
			
		}
		
		dfs(V);
		
		bw.newLine();
		
		queue = new LinkedList<>();
		visited = new boolean[N+1];
		
		bfs(V);
		
		bw.flush();
		bw.close();
		br.close();
		
		
	}
	
	static void dfs(int start) throws IOException {
		
		visited[start] = true;
		
		bw.write(start + " ");
		
		for (int num : graph.get(start)) {
			
			if (!visited[num]) {
				
				dfs(num);
				
			}
		}
		
	}
	
	static void bfs(int start) throws IOException {
		
		visited[start] = true;
		
		bw.write(start + " ");
		
		queue.offer(start);
		
		while(!queue.isEmpty()) {
			
			int next = queue.poll();
			
			for (int num : graph.get(next)) {
				
				if (!visited[num]) {
					
					visited[num] = true;
					
					bw.write(num + " ");
					
					queue.offer(num);
					
				}
				
			}
		
			
		}
	}

}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	static ArrayList<ArrayList<Integer>> al;
	static boolean[] visited;
	static int result;
	
	static void dfs(int x)
	{
		for(int i=0; i<al.get(x).size(); i++)
		{
			if(!visited[al.get(x).get(i)])
			{
				visited[al.get(x).get(i)] = true;
				result++;
				dfs(al.get(x).get(i));
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		
		int computer = Integer.parseInt(br.readLine());
		int connection = Integer.parseInt(br.readLine());
		// 초기화
		al = new ArrayList<>();
		visited = new boolean[computer+1];
		
		// 그래프 만들기 
		for(int i=0; i<=computer; i++) al.add(new ArrayList<>());
		
		for(int i=0; i<connection; i++)
		{
			String[] input = br.readLine().split(" ");
			al.get(Integer.parseInt(input[0])).add(Integer.parseInt(input[1]));
			al.get(Integer.parseInt(input[1])).add(Integer.parseInt(input[0]));
		}
		
		visited[1] = true;
		dfs(1);
		sb.append(result);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
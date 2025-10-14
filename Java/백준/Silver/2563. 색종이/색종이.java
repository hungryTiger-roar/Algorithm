import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		// 흰색 도화지 배열 만들기
		boolean[][] visited = new boolean[100][100];
		
		// 검은색 색종이 영역에 true값 넣기
		for(int i=0; i<N; i++)
		{
			int X = sc.nextInt();
			int Y = sc.nextInt();
			
			for(int x=0; x<10; x++)
			{
				for(int y=0; y<10; y++)
				{
					visited[X+x][Y+y] = true;
				}
			}
		}
		
		
		// 검은색 색종이 영역의 넓이 구하기
		int cnt = 0;
		
		for(int i=0; i<visited.length; i++)
		{
			for(int j=0; j<visited[i].length; j++)
			{
				if(visited[i][j]==true)
				{
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
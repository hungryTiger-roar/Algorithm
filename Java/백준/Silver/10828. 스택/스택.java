import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		// N번 명령이면 최대 N개
		int[] stack = new int[N];
		int pointer = -1;
		
		// 배열로 만드는 방법
		for(int i=0; i<N; i++)
		{
			String[] input = br.readLine().split(" ");
			
			if(input[0].equals("push"))
			{
				stack[++pointer] = Integer.parseInt(input[1]);
			}
			else if(input[0].equals("pop"))
			{
				if(pointer != -1)
				{
					System.out.println(stack[pointer--]);
				}
				else
				{
					System.out.println(-1);
				}
			}
			else if(input[0].equals("size"))
			{
				// pointer가 가리키는 인덱스 + 0번째 인덱스가 크기
				System.out.println(pointer+1);
			}
			else if(input[0].equals("empty"))
			{
				if(pointer != -1)
				{
					System.out.println(0);
				}
				else
				{
					System.out.println(1);
				}
			}
			else if(input[0].equals("top"))
			{
				if(pointer != -1)
				{
					System.out.println(stack[pointer]);
				}
				else
				{
					System.out.println(-1);
				}
			}
		}
	}
}
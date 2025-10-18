import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 명령의 수
		int N = Integer.parseInt(br.readLine()); // 명령의 수
		String[] stack = new String[N]; // 스택 배열
		// 배열로 하기 위해서는 포인터 필수!
		int pointer = -1;
		for(int i=0; i<N; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			String orderNum = st.nextToken();
			if(orderNum.equals("1"))
			{
				stack[++pointer] = st.nextToken(); // 현재 포인터 위치+1에 값을 넣어준다!
			}
			else if(orderNum.equals("2"))
			{
				if(pointer == -1) System.out.println("-1");
				else
				{
					System.out.println(stack[pointer--]); // 현재 포인터 위치의 스택값을 출력한 후, 포인터 위치를 -1 해준다
				}
			}
			else if(orderNum.equals("3"))
			{
				System.out.println(pointer+1);
			}
			else if(orderNum.equals("4"))
			{
				if(pointer == -1) System.out.println("1");
				else System.out.println("0");
			}
			else if(orderNum.equals("5"))
			{
				if(pointer == -1) System.out.println("-1");
				else System.out.println(stack[pointer]);
			}
		}
	}
}
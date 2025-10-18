import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 명령의 수
		int N = Integer.parseInt(br.readLine()); // 명령의 수
		String[] stack = new String[N]; // 스택 배열
		// 배열로 하기 위해서는 포인터 필수!
		int front = 0;
		int rear = 0;
		for(int i=0; i<N; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			String orderNum = st.nextToken();
			if(orderNum.equals("push"))
			{
				stack[rear++] = st.nextToken(); // 현재 rear 위치에 값을 넣어주고 다음 push를 위해+1해준다!
			}
			else if(orderNum.equals("pop"))
			{
				if(front == rear) sb.append("-1\n"); // front와 rear가 같다는 것은 큐에 정수가 없다는 것!
				else
				{
					sb.append(stack[front++]+ "\n"); // 현재 front 위치의 스택값을 출력한 후, 큐의 맨 앞자리에 있는 스택의 위치는 +1이 된다!
				}
			}
			else if(orderNum.equals("size"))
			{
				sb.append(rear - front + "\n");
			}
			else if(orderNum.equals("empty"))
			{
				if(front == rear) sb.append("1\n");
				else sb.append("0\n");
			}
			else if(orderNum.equals("front"))
			{
				if(front == rear) sb.append("-1\n");
				else sb.append(stack[front]+ "\n");
			}
			else if(orderNum.equals("back"))
			{
				if(front == rear) sb.append("-1\n");
				else sb.append(stack[rear-1]+ "\n"); // rear의 위치를 push하기 위해 앞에 놓았기 때문에 가장 뒤에 있는 정수는 rear-1에 있다!
			}
		}
		System.out.println(sb);
	}
}
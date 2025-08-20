import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int[] num;
    static int[] result;
    static boolean[] visited;
    

    // 순열 함수
    static void perm(int depth)
    {
        if(depth == M)
        {
            for(int i=0; i<result.length; i++)
            {
            	System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }
        // 중복 방지를 위한 임의의 값 설정(입력으로 주어지는 수는 10,000보다 작거나 같은 자연수)
        int before =0;
        for(int i=0; i<num.length; i++)
        {
            if(!visited[i] && num[i] != before)
            {
                visited[i] = true;
                result[depth] = num[i];
                perm(depth+1);
                visited[i] = false;
                before = num[i]; // 이번 depth에서 쓴 숫자 기억
            }
        }
    }
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String[] input = sc.nextLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        
        // 숫자배열
        num = new int[N];
        input = sc.nextLine().split(" ");
        for(int i=0; i<N; i++)
        {
            num[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(num);
        
        // 결과배열
        result = new int[M];
        // 방문여부 배열
        visited = new boolean[num.length];
        
        
        // 순열 함수 실행
        perm(0);
        
    }
}
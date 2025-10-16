import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 수의 개수 N
		int N = sc.nextInt();
		
		// N개의 크기의 배열 만들어주기
		int[] array = new int[N];
		// 배열에 입력된 수 다 넣어주기
		for(int i=0; i<N; i++)
		{
			array[i] = sc.nextInt();
		}
		// 배열 정렬해주기
		Arrays.sort(array);
		// 정렬한 결과 한 줄 씩 출력하기
		for(int i=0; i<N; i++)
		{
			System.out.println(array[i]);
		}
	}
}
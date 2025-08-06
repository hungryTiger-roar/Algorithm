import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		// 배열 만들기
		int[] array = new int[N];
		
		for (int i=0; i<N; i++) {
			array[i] = sc.nextInt();
		}
		
		// X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력
		for (int i=0; i<N; i++) {
			if(array[i] < X) {
				System.out.printf("%d ", array[i]);
			}
		}
	}
}
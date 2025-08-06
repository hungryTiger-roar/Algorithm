import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		// 배열 만들기
		int[] array = new int[N];
		for(int i=0; i<M; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int number = sc.nextInt();
			
			for (int j=start-1; j<end; j++) {
				array[j] = number;
			}
		}
		for(int i=0; i<array.length; i++) {
			System.out.printf("%d ", array[i]);
		}
	}
}
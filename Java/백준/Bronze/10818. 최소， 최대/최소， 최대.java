import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		// 배열 만들기
		int[] array = new int[N];
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		// 최소값 구하기
		int min = Integer.MAX_VALUE;
		for(int i=0; i<array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		// 최대값 구하기
		int max = Integer.MIN_VALUE;
		for(int i=0; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.printf("%d %d", min, max);
		
	}
}
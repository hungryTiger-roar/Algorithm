import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 배열 만들기
		int[] array = new int[9];
		for(int i=0; i<9; i++) {
			array[i] = sc.nextInt();
		}
		
		// 최댓값과 몇 번째 수인지 구하기
		int maxInt = 0;
		int maxIndex = 0;
		for(int i=0; i<9; i++) {
			if(array[i]>maxInt) {
				maxInt = array[i];
				maxIndex = i+1;
			}
		}
		System.out.println(maxInt);
		System.out.println(maxIndex);
	}
}
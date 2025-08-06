import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		// 배열 만들기
		int[] array = new int[N];
		for(int i=0; i<array.length; i++) {
			array[i] = i+1;
		}
		// 공 바꾸기
		for(int i=0; i<M; i++) {
			// 입력받은 i번째
			int num1 = sc.nextInt();
			// 입력받은 j번째
			int num2 = sc.nextInt();
			// 원래 i번째 있던 공
			int changeNum = array[num1-1];
			// j번째에 있던 공을 i번째로 옮기기
			array[num1-1] = array[num2-1];
			// i번째에 있던 공을 j번째로 옮기기
			array[num2-1] = changeNum;
		}
		for(int i=0; i<array.length; i++) {
			System.out.printf("%d ", array[i]);
		}
	}
}
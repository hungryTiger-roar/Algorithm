import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수의 개수
		int N = sc.nextInt();
		
		// 배열만들기
		int[] array = new int[N];
		
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		// 찾으려는 정수 v
		int v = sc.nextInt();
		
		// v와 같은 글자 찾기
		int cnt = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i] == v) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// A,B,V 입력받기
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		// 정상에 올라가기 직전 마지막으로 올라가는 높이 제외하기
		int restMeter = V-A;
		// 며칠 걸리는지 (마지막으로 오르는 일 수 미리 추가)
		int result = 1;
		
		// (A-B) => 하루 동안에 A-B미터 올라간다
		result += restMeter / (A-B);
		if(restMeter % (A-B) > 0) result++;

		System.out.println(result);
	}
}
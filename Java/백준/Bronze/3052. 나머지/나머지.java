import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 나머지 배열 만들기 / 42로 나눈 나머지 : 0~42
		int[] array = new int[43];
		
		// 기입한 숫자의 나머지와 같은 인덱스에 1 기입
		for(int i=0; i<10; i++)
		{
			int n = (sc.nextInt()) % 42;
			array[n] = 1;
		}
		
		// 1이 적인 인덱스 카운트
		int cnt = 0;
		for(int i=0; i<43; i++)
		{
			if(array[i] == 1)
			{
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
}
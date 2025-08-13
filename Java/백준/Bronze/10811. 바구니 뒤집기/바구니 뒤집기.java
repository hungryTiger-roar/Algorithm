import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		// 바구니 배열 만들기 : 0~N
		int[] array = new int[N+1];
		int[] temp = new int[N+1];
		for(int k=0; k<array.length; k++)
		{
			array[k] = k;
			temp[k] = k;
		}
	
		
		// M번 실행
		int M = sc.nextInt();
		for(int k=0; k<M; k++)
		{
			// 한 바퀴 돌고 바뀐 상태 temp 배열에 복사(깊은 복사)
			for (int t = 0; t < array.length; t++) {
			    temp[t] = array[t];
			}
			
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			for(int n=0; n<=j-i; n++)
			{
				array[i+n] = temp[j-n];
			}
			
			// 1번 실행한 결과 저장(얇은 복사라 불가능)
//			temp = array;
			

//////////////////////////////////////////////////
			// i번째 j번째 둘만 바꾸는 방법
//			int tmp = array[i];
//			
//			array[i] = array[j];
//			array[j] = tmp;
//////////////////////////////////////////////////
			
		}
		
		// 배열의 1~N번째 조회
		for(int k=1; k<array.length; k++)
		{
			System.out.print(array[k] + " ");
		}
	}
}
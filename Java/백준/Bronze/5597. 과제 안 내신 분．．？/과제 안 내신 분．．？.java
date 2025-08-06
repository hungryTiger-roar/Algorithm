import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 제출한 학생들 배열 만들기
		int[] submit = new int[28];
		for(int i=0; i<submit.length; i++) {
			submit[i] = sc.nextInt();
		}
		
		// 새로운 배열 만들어서 제출한 학생들 순서대로 추가 -> 제출 안한 사람은 0
		int[] students = new int[30];
		for(int i=0; i<submit.length; i++) {
			students[submit[i]-1] = submit[i];
		}
		
		// 값이 0인 학생 출력
		for(int i=0; i<students.length; i++) {
			if(students[i]==0) {
				System.out.println(i+1);
			}
		}
	}
}
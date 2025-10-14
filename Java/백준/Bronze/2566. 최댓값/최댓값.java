import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxNum = -1; // 입력될 수는 100보다 작은 자연수 또는 0이기 때문
		int row = 0;
		int col = 0;
		
		for (int i=0; i<9; i++)
		{
			String[] input = sc.nextLine().split(" ");
			for (int j=0; j<9; j++)
			{
				int tmp = Integer.parseInt(input[j]);
				if(tmp > maxNum)
				{
					maxNum = tmp;
					row = i+1;
					col = j+1;
				}
			}
		}
		System.out.println(maxNum);
		System.out.print(row + " " + col);
	}
}
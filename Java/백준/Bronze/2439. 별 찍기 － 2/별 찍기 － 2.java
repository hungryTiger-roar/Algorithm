import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for(int i=1; i<=N; i++)
		{
			String result = "";
			for(int j=0; j<N-i; j++)
			{
				result += " ";
			}
			for(int k=0; k<i; k++)
			{
				result += "*";
			}
			System.out.println(result);
		}
	}
}
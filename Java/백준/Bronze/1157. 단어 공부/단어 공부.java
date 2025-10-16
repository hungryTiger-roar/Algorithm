import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력받은 단어 char 배열
		char[] input = sc.nextLine().toCharArray();
		
		// 알파벳 배열
		char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		// 사용된 알파벳 갯수 배열
		int[] times = new int[alphabet.length];
		
		for(int i=0; i<input.length; i++)
		{
			if(input[i] == 'A' || input[i] == 'a') times[0]++;
			else if(input[i] == 'B' || input[i] == 'b') times[1]++;
			else if(input[i] == 'C' || input[i] == 'c') times[2]++;
			else if(input[i] == 'D' || input[i] == 'd') times[3]++;
			else if(input[i] == 'E' || input[i] == 'e') times[4]++;
			else if(input[i] == 'F' || input[i] == 'f') times[5]++;
			else if(input[i] == 'G' || input[i] == 'g') times[6]++;
			else if(input[i] == 'H' || input[i] == 'h') times[7]++;
			else if(input[i] == 'I' || input[i] == 'i') times[8]++;
			else if(input[i] == 'J' || input[i] == 'j') times[9]++;
			else if(input[i] == 'K' || input[i] == 'k') times[10]++;
			else if(input[i] == 'L' || input[i] == 'l') times[11]++;
			else if(input[i] == 'M' || input[i] == 'm') times[12]++;
			else if(input[i] == 'N' || input[i] == 'n') times[13]++;
			else if(input[i] == 'O' || input[i] == 'o') times[14]++;
			else if(input[i] == 'P' || input[i] == 'p') times[15]++;
			else if(input[i] == 'Q' || input[i] == 'q') times[16]++;
			else if(input[i] == 'R' || input[i] == 'r') times[17]++;
			else if(input[i] == 'S' || input[i] == 's') times[18]++;
			else if(input[i] == 'T' || input[i] == 't') times[19]++;
			else if(input[i] == 'U' || input[i] == 'u') times[20]++;
			else if(input[i] == 'V' || input[i] == 'v') times[21]++;
			else if(input[i] == 'W' || input[i] == 'w') times[22]++;
			else if(input[i] == 'X' || input[i] == 'x') times[23]++;
			else if(input[i] == 'Y' || input[i] == 'y') times[24]++;
			else if(input[i] == 'Z' || input[i] == 'z') times[25]++;
		}
		
		// 가장 많이 사용된 알파벳 인덱스
		int index = -1;
		// 가장 많이 사용된 횟수
		int max = 0;
		for(int i=0; i<times.length; i++)
		{
			if(times[i] > max)
			{
				max = times[i];
				index = i;
			}
		}
		char result = alphabet[index];
		for(int i=0; i<times.length; i++)
		{
			// 다른 알파벳도 가장 많이 사용된 횟수인 경우 ? 출력 
			if(i!=index && times[i] == max)
			{
				result = '?';
			}
		}
		System.out.println(result);
	}
}
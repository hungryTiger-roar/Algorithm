import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String[] input = new String[5];
		// 가장 긴 글자수
		int max = 0;
		for(int i=0; i<5; i++)
		{
			input[i]= br.readLine();
			max = Integer.max(max, input[i].length());
		}
		// 가장 긴 글자수만큼 반복
		for(int i=0; i<max; i++)
		{
			for(int j=0; j<input.length; j++)
			{
				if(i > input[j].length()-1) continue; // 글자수가 적은 경우 컨티뉴
				sb.append(input[j].charAt(i));
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
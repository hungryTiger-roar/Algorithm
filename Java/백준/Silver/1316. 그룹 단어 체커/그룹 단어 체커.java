import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		// 그룹단어가 몇개인지
		int result = 0;
		
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++)
		{
			char[] input = br.readLine().toCharArray();
			// 입력된 단어에서 연속되는 문자는 빼고 리스트에 넣어주기
			ArrayList<Character> al = new ArrayList<>();
			al.add(input[0]);
			for(int j=1; j<input.length; j++)
			{
				if(input[j-1] != input[j])
				{
					al.add(input[j]);
				}
			}
			
			// a~z => 97~122 총 26개
			// 압축된 al이 알파벳 별로 몇개 있는지 카운트하기
			int[] cnt = new int[26];
			for(int j=0; j<al.size(); j++)
			{
				cnt[((int)al.get(j)) - 97]++; // a는 0번 인덱스에, z는 25번 인덱스에 +1 해주기
			}
			
            // 그룹단어 여부
			boolean isGroupWord = true;
			for(int j=0; j<cnt.length; j++)
			{
				if(cnt[j] > 1) // 그룹단어가 아닌경우
				{
					isGroupWord = false;
					break;
				}
			}
			if(isGroupWord) result++; // 그룹단어이면 +1 해주기
		}
		sb.append(result);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
			// 중복된 단어 모두 빼기
			Set<Character> set = new HashSet<>();
			al.add(input[0]);
			for(int j=1; j<input.length; j++)
			{
				if(input[j-1] != input[j]) al.add(input[j]); // 리스트는 연속되는 경우가 아니면 넣어주기
			}
			// 셋은 그냥 추가해주면 중복된 값은 알아서 빼줌
			for(int j=0; j<input.length; j++) set.add(input[j]); 
			
			if(set.size() == al.size()) // 다른 경우는 그룹단어가 아님
			{
				result++;
			}
		}
		sb.append(result);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        boolean[][] paper = new boolean[100][100];

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = y; j < y+10; j++) {

                for (int k = x; k < x+10; k++) {

                    paper[j][k] = true;
                }
            }

        }

        int cnt = 0;

        for (int i = 0; i < 100; i++) {

            for (int j = 0; j < 100; j++) {

                if (paper[i][j]) {
                    cnt++;
                }
            }
        }

        bw.write(String.valueOf(cnt));

        bw.flush();
        bw.close();
        br.close();
    }


}
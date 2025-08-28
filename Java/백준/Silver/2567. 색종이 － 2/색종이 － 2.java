import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        boolean[][] paper = new boolean[100][100];

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            for (int j = x; j < x+10; j++) {

                for (int k = y; k < y+10; k++) {

                    paper[j][k] = true;
                }

            }

        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        int cnt = 0;

        for (int i = 0; i < 100; i++) {

            for (int j = 0; j < 100; j++) {

                if (paper[i][j]) {

                    for (int k = 0; k < 4; k++) {

                        int newX = i + dx[k];
                        int newY = j + dy[k];

                        if (newX < 0 || newX >= 100 || newY < 0 || newY >= 100 || !paper[newX][newY]) {
                            cnt++;
                        }
                    }
                }
            }
        }

        bw.write(String.valueOf(cnt));

        bw.flush();
        bw.close();
        br.close();
    }

}
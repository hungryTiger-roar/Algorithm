import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int min = Integer.MAX_VALUE;
	static int count;
	static int[][] chess;

	public static void main(String[] args) throws Exception {

		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String[] nmStrings = bReader.readLine().split(" ");

		int N = Integer.parseInt(nmStrings[0]);
		int M = Integer.parseInt(nmStrings[1]);

		chess = new int[N][M];

		for (int i = 0; i < N; i++) {
			String[] inputStrings = bReader.readLine().split("");
			for (int j = 0; j < M; j++) {
				String checkString = inputStrings[j];
				if (checkString.equals("W")) {
					chess[i][j] = 0;
				} else {
					chess[i][j] = 1;
				}

			}
		}

		for (int i = 0; i < N - 7; i++) {
			for (int j = 0; j < M - 7; j++) {
				count = 0;
				chessCheck(i, j);
				if (count < min) {
					min = count;
				}
				count = 0;
				chessCrossCheck(i, j);
				if (count < min) {
					min = count;
				}
			}
		}

		System.out.println(min);

	}

	private static void chessCrossCheck(int i, int j) {

		int oriCheck;
		if (chess[i][j] == 1) {
			oriCheck = 0;
		} else {
			oriCheck = 1;
		}

		int check = oriCheck;

		for (int l = i; l <= i + 7; l++) {

			if ((oriCheck == 0) && (l % 2 == 0)) {
				check = 0;
			} else if ((oriCheck == 0) && (l % 2 == 1)) {
				check = 1;
			} else if ((oriCheck == 1) && (l % 2 == 0)) {
				check = 1;
			} else if ((oriCheck == 1) && (l % 2 == 1)) {
				check = 0;
			}

			for (int k = j; k <= j + 7; k++) {

				if ((k % 2 == 0) && chess[l][k] != check) {
					count++;
				}

				if ((k % 2 == 1) && chess[l][k] == check) {
					count++;
				}

			}
		}

	}

	private static void chessCheck(int i, int j) {

		int oriCheck = chess[i][j];
		int check = oriCheck;

		for (int l = i; l <= i + 7; l++) {

			if ((oriCheck == 0) && (l % 2 == 0)) {
				check = 0;
			} else if ((oriCheck == 0) && (l % 2 == 1)) {
				check = 1;
			} else if ((oriCheck == 1) && (l % 2 == 0)) {
				check = 1;
			} else if ((oriCheck == 1) && (l % 2 == 1)) {
				check = 0;
			}

			for (int k = j; k <= j + 7; k++) {

				if ((k % 2 == 0) && chess[l][k] != check) {
					count++;
				}

				if ((k % 2 == 1) && chess[l][k] == check) {
					count++;
				}

			}
		}

	}

}

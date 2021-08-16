package graph.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 중복 조합
public class BOJ_15652 {

    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static int N, M;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        multisetCombination(1, 0, "");
        System.out.println(sb);
    }

    private static void multisetCombination(int idx, int depth, String str) {
        if (depth == M) { // Base case
            for (int i = 0; i < M; i++) {
                sb.append(str.charAt(i)).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = idx; i <= N; i++) {
            multisetCombination(i, depth + 1, str + i);
        }
    }
}

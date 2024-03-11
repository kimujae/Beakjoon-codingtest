import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10813 {
    static BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        int[] ans = new int[N];


        for(int i = 0; i < N; i++) {
            ans[i] = i + 1;
        }

        for(int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int idx1 = Integer.parseInt(input[0]) - 1;
            int idx2 = Integer.parseInt(input[1]) - 1;

            int tmp = ans[idx1];
            ans[idx1] = ans[idx2];
            ans[idx2] = tmp;
        }


        for(int num : ans) {
            System.out.print(num + " ");
        }



    }
}

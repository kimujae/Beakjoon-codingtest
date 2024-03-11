import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10810 {
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

        for(int i = 0; i < M; i++) {
            String[] in = br.readLine().split(" ");
            int start = Integer.parseInt(in[0]) - 1;
            int end = Integer.parseInt(in[1]) - 1;
            int num = Integer.parseInt(in[2]);


            for(int j = start; j <= end; j++) {
                ans[j] = num;
            }
        }


        for(int num : ans) {
            System.out.print(num + " ");
        }
    }
}

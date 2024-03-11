import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10811 {
    static BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for(int i = 0; i < M; i++ ) {
            String[] input1 = br.readLine().split(" ");
            int start = Integer.parseInt(input1[0]);
            int end = Integer.parseInt(input1[1]);

            int cnt = 0;
            for(int j = start - 1; j < ((start + end - 2)/2) + 1 ; j++) {
                int tmp = arr[j];
                arr[j] = arr[end - 1 - cnt];
                arr[end - 1 - cnt] = tmp;
                cnt ++;
                //System.out.println(111);

            }
        }


        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}

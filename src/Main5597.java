import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main5597 {
    static BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int X;
    static int M;
    public static void main(String[] args) throws IOException {
        boolean[] v = new boolean[31];

        for(int i = 0; i < 28 ; i++) {
            int num = Integer.parseInt(br.readLine());

            v[num] = true;
        }

        for(int i = 1; i < 31; i++) {
            if(!v[i])System.out.println(i);
        }
    }
}

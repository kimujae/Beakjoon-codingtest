import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main3052 {
    static BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int A;
    static int B;

    public static void main(String[] args) throws IOException {
        Set set = new HashSet();

        for(int i = 0; i < 10; i++) {
            int input = Integer.parseInt(br.readLine());

            set.add(input % 42);
        }

        System.out.println(set.size());
    }
}

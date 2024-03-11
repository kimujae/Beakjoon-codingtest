import java.io.*;
import java.util.StringTokenizer;

public class Main2562{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int max = 0;
        int toggle;
        int count = 0;

        for(int  i = 1; i <= 9; i++){
            toggle = max;
            max = Math.max(max, Integer.parseInt(br.readLine()));
            if(toggle!= max) count = i;
        }

        bw.write(String.valueOf(max));
        bw.append('\n');
        bw.write(String.valueOf(count));
        bw.flush();
    }
}

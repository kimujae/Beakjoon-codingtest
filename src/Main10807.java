import java.util.*;
import java.io.*;
class Main10807 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int v;
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException{
        v = Integer.parseInt(br.readLine());
        //st = new StringTokenizer(br.readLine());
        String[] strArr = br.readLine().split(" ");


        int idx = 0;
        for(String num : strArr) {
            int n = Integer.parseInt(num);
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        v = Integer.parseInt(br.readLine());
        if(map.get(v)== null)System.out.println(0);
        else System.out.println(map.get(v));

    }

}
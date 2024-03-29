package practice.from1000to1999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
public class No1654 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] s = br.readLine().split(" ");

        // 랜선 갯수
        int k = Integer.parseInt(s[0]);
        // 필요한 랜선의 갯수
        int n = Integer.parseInt(s[1]);

        int[] arr = new int[k];


        for(int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        sb.append(Arrays.toString(arr));


        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

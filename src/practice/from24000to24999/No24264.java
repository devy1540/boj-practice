package practice.from24000to24999;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;
public class No24264 {
    public static void main(String[] args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());

        bw.write(String.format("%s\n", n * n));
        bw.write(String.valueOf(2));

        bw.flush();
        bw.close();
        br.close();
    }


}

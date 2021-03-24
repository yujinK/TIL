package boj;

import java.io.*;

public class BOJ_10996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n * 2; i++) {
            for (int j = 0; j < n; j++) {
                if ((i ^ j) % 2 == 0) {
                    bw.append("*");
                } else {
                    bw.append(" ");
                }
            }
            bw.newLine();
        }

        bw.flush();
    }
}

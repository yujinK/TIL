package boj;

import java.io.*;

public class BOJ_1904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(br.readLine());

        if (n <= 2) {
            System.out.println(n);
        } else {
            int[] tiles = new int[n+1];
            tiles[1] = 1;
            tiles[2] = 2;

            for (int i = 3; i <= n; i++) {
                tiles[i] = (tiles[i - 1] + tiles[i - 2]) % 15746;
            }

            System.out.println(tiles[n]);
        }
    }
}

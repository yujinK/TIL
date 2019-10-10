package boj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1966 {
    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i=0; i<t; i++) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] importance = new int[n];
            Queue<Integer> queue = new LinkedList<>();
            int count = 0;

            for (int j=0; j<n; j++) {
                importance[j] = scan.nextInt();
                queue.add(j);
            }

            while (true) {
                int max = 0;

                for (int k=0; k<n; k++) {
                    if (importance[k] > max) {
                        max = importance[k];
                    }
                }

                if (importance[queue.peek()] == max) {
                    count++;
                    int out = queue.poll();
                    importance[out] = -1;

                    if (out == m) {
                        System.out.println(count);
                        break;
                    }
                } else if (importance[queue.peek()] < max) {
                    queue.add(queue.poll());
                }
            }
        }
    }
}

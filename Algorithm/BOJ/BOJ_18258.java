package boj;

import java.io.*;

public class BOJ_18258 {
    public static int[] queue = new int[10000000];
    public static int idx_front = 0;
    public static int idx_back = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            String[] input = br.readLine().split(" ");

            switch (input[0]) {
                case "push":
                    push(Integer.parseInt(input[1]));
                    break;
                case "pop":
                    bw.append(pop() + "\n");
                    break;
                case "size":
                    bw.append(size() + "\n");
                    break;
                case "empty":
                    bw.append(empty() + "\n");
                    break;
                case "front":
                    bw.append(front() + "\n");
                    break;
                case "back":
                    bw.append(back() + "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void push(int n) {
        if (idx_front > idx_back) {
            idx_back = idx_front;
            queue[idx_back] = n;
        } else {
            queue[++idx_back] = n;
        }
    }

    public static int pop() {
        if (idx_front > idx_back) {
            return -1;
        } else {
            return queue[idx_front++];
        }
    }

    public static int size() {
        return idx_back - idx_front + 1;
    }

    public static int empty() {
        if (idx_front > idx_back) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int front() {
        if (idx_front > idx_back) {
            return -1;
        } else {
            return queue[idx_front];
        }
    }

    public static int back() {
        if (idx_front > idx_back) {
            return -1;
        } else {
            return queue[idx_back];
        }
    }
}

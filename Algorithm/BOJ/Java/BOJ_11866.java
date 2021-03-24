package boj;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_11866 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> permutation = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int count = 0;

        for (int i=1; i<=n; i++) {
            queue.add(i);
        }

        while (queue.size() > 0) {
            count++;

            if (count == k) {
                permutation.add(queue.poll());
                count = 0;
            } else {
                queue.add(queue.poll());
            }
        }

        String answer = "<";

        for (int i=0; i<permutation.size(); i++) {
            if (i != permutation.size()-1) {
                answer += permutation.get(i) + ", ";
            } else {
                answer += permutation.get(i) + ">";
            }
        }

        System.out.println(answer);
    }
}

package programmers;

import java.util.*;

public class FunctionDev {
    public static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int day = (100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i] + 1;
            queue.offer(day);
        }

        int max = -1;
        while (!queue.isEmpty()) {
            int day = queue.poll();
            if (max == -1 || day > max) {
                list.add(1);
                max = day;
            } else {
                int index = list.size() - 1;
                list.set(index, list.get(index) + 1);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] dayOfEnd = new int[100];
        int max = -1;
        for (int i=0; i<progresses.length; i++) {
            int day = (100 - progresses[i]) % speeds[i] == 0? (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i] + 1;
            if (day > max) {
                dayOfEnd[day]++;
                max = day;
            } else {
                dayOfEnd[max]++;
            }
        }

        return Arrays.stream(dayOfEnd).filter(i -> i!=0).toArray();
    }

    public static void main(String[] args) {
//        int[] progresses = {93, 30, 55};
        int[] progresses = {1, 2, 3, 4, 5};
        int[] speeds = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }
}

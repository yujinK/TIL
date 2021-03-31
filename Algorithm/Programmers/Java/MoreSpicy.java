package programmers;

import java.util.PriorityQueue;
import java.util.Queue;

public class MoreSpicy {

	public static void main(String[] args) {
		int[] scoville = {0, 0, 0, 1};
		int K = 1;
		
		System.out.println(solution(scoville, K));
	}
	
	public static int solution(int[] scoville, int K) {
		int answer = -1;
		int count = 0;
		Queue<Integer> pq = new PriorityQueue<Integer>();
		
		for (int i=0; i<scoville.length; i++) {
			pq.offer(scoville[i]);
		}
		
		while (pq.size() > 1) {
			if (pq.peek() >= K) {
				answer = count;
				break;
			}
			
			int newScoville = pq.poll() + (pq.poll() * 2);
			pq.offer(newScoville);
			count++;
		}
		
		if (pq.poll() >= K) {
			answer = count;
		}
		
		return answer;
	}
	
//	public static int solution(int[] scoville, int K) {
//		int answer = 0;
//		int[] heap = new int[scoville.length + 1];
//		int heapSize = 0;
//		
//		for (int i=1; i<=scoville.length; i++) {
//			insertHeap(heap, ++heapSize, scoville[i-1]);
//		}
//		
//		while (heap[1] < K && heapSize > 0) {
//			answer++;
//			int newScoville = heap[1] + (Math.min(heap[2], heap[3]) * 2);
//			deleteHeap(heap, heapSize);
//			heapSize -= 2;
//			insertHeap(heap, ++heapSize, newScoville);
//			
//			if (heap[1] >= K) {
//				return answer;
//			}
//		}
//		
//		return -1;
//	}
//	
//	public static void deleteHeap(int[] heap, int heapSize) {
//		if (heapSize == 0) {
//			return;
//		}
//		
//		for (int i=1; i<=2; i++) {
//			heap[1] = heap[heapSize];
//			heap[heapSize--] = 0;
//			
// 			for (int j=1; j*2+1<=heapSize;) {
//				if (heap[j] < heap[j*2] && heap[j] < heap[j*2+1]) {
//					break;
//				} else if (heap[j*2] < heap[j*2+1]) {
//					swap(heap, j, j*2);
//					j = j*2;
//				} else {
//					swap(heap, j, j*2+1);
//					j = j*2+1;
//				}
//			}
//		}
//	}
//	
//	public static void insertHeap(int[] heap, int heapSize, int newScoville) {
//		heap[heapSize] = newScoville;
//		
//		for (int i=heapSize; i>0; i/=2) {
//			if (heap[i/2] > heap[i]) {
//				swap(heap, i/2, i);
//			} else {
//				break;
//			}
//		}
//	}
//	
//	public static void swap(int[] heap, int i, int j) {
//		int temp = heap[i];
//		heap[i] = heap[j];
//		heap[j] = temp;
//	}

}

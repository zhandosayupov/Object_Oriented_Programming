package Week13;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class p20_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PriorityQueue<String> heap = new PriorityQueue<>();
        String[] words = input.nextLine().split(" ");
        heap.addAll(List.of(words));
        while(!heap.isEmpty()) {
            System.out.println(heap.peek());
            heap.poll();
        }
    }
}

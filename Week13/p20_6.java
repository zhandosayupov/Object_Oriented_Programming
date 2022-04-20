package Week13;

import java.lang.runtime.*;
import java.util.ArrayList;
import java.util.Random;

public class p20_6 {
    public static void first(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int x: numbers) {
            sum += x;
        }
    }

    public static void second(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(50000000);
        Random rand = new Random();
        for (int i = 0; i < 50000000; i++) {
            numbers.add(rand.nextInt());
        }
        long r1_start = System.currentTimeMillis();
        first(numbers);
        long r1_end = System.currentTimeMillis();
        System.out.println((r1_end - r1_start) + " milliseconds");
        long r2_start = System.currentTimeMillis();
        second(numbers);
        long r2_end = System.currentTimeMillis();
        System.out.println((r2_end - r2_start) + " milliseconds");
    }
}

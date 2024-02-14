package src.oopsadv.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab01 {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue();
        pq.add(132);
        pq.add(13);
        pq.add(1);
        System.out.println(pq);
    }
}

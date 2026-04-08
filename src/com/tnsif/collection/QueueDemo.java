package com.tnsif.collection;

import java.util.LinkedList;
import java.util.Queue;
//import
public class QueueDemo {
    public static void main(String[] args) {
        Queue queue = new LinkedList<>();
        queue.add("hi");
        queue.add("hello");
        queue.add("world");
        //view head element
        System.out.println("Queue" +queue.peek());

        //remove elements
        System.out.println("Removed :"+queue.poll());
        System.out.println("Removed :"+queue.remove());

        //display the queue
        System.out.println("Queue -> "+queue);
    }
}

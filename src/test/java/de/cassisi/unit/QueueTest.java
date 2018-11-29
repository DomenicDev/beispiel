package de.cassisi.unit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    private Queue queue;

    @Before
    public void createQueue() {
        this.queue = new Queue(3);
    }

    private void printQueue() {
        for (int i = 0; i < queue.queue.length; i++) {
            System.out.print(queue.queue[i] + ",  ");
        }
        System.out.println();
    }


    @Test (expected = IllegalStateException.class)
    public void test() {
        queue.dequeue();
    }

    @Test
    public void testQueue() {
        // add values
        for (int i = 1; i <= 3; i++) {
            this.queue.enqueue(i);
        }
        for (int i = 1; i <= 3; i++) {
            assertEquals(i, this.queue.dequeue());
        }

        for (int i = 1; i <= 4; i++) {
            this.queue.enqueue(i);
        }

        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(4, queue.dequeue());




    }


}

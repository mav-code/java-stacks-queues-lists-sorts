package stacks.queues.java;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;

public class MyQueueTest {

    // Queue Tests

    @Test
    public void queueIsInitializedEmpty() {
        MyQueue queue = new MyQueue();
        assertTrue( "Queue is initialized empty", queue.getHead() == null);
    }

    @Test
    public void queueCanCallIsEmpty(){
        MyQueue queue = new MyQueue();
        assertTrue( "Queue is initialized empty", queue.isEmpty());
    }

    @Test
    public void addItemToQueue() {
        MyQueue queue = new MyQueue();
        queue.add(5);
        assertNotNull( "Node added to empty queue becomes head", queue.getHead());
    }

    @Test
    public void canPeekQueue(){
        MyQueue queue = new MyQueue();
        queue.add(5);
        assertEquals( "Can peek at first item in queue", 5, queue.peek());
    }

    @Test
    public void canPeekEmptyQueue(){
        MyQueue queue = new MyQueue();
        assertNull("Peeking empty queue returns null", queue.peek());
    }

    @Test
    public void removeItemFromQueue(){
        MyQueue queue = new MyQueue();
        queue.add(5);
        queue.add(7);
        queue.add(9);
        assertEquals("Node removed from queue has correct value", 5, queue.remove());
    }

    @Test
    public void removeLastItemFromQueue(){
        MyQueue queue = new MyQueue();
        queue.add(5);
        queue.remove();
        assertNull("Tail is null when last item is removed", queue.getTail());
        assertNull("Head is null when last item is removed", queue.getHead());

    }
}

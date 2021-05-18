package stacks.queues.java;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;

public class MyStackTest {
    // Stack Tests

    @Test
    public void StackIsInitializedEmpty() {
        MyStack stack = new MyStack();
        assertTrue( "Stack is initialized empty", stack.getTop() == null);
    }

    @Test
    public void stackCanCallIsEmpty(){
        MyStack stack = new MyStack();
        assertTrue( "Stack is initialized empty", stack.isEmpty());
    }

    @Test
    public void addItemToStack() {
        MyStack stack = new MyStack();
        stack.push(5);
        assertNotNull( "Node added to empty stack becomes head", stack.getTop());
    }

    @Test
    public void canPeekStack(){
        MyStack stack = new MyStack();
        stack.push(5);
        assertEquals( "Can peek at first item in stack", 5, stack.peek());
    }

    @Test
    public void canPeekEmptyStack(){
        MyStack stack = new MyStack();
        assertNull("Peeking empty stack returns null", stack.peek());
    }

    @Test
    public void removeItemFromStack(){
        MyStack stack = new MyStack();
        stack.push(5);
        stack.push(7);
        stack.push(9);
        assertEquals("Node removed from stack has correct value", 9, stack.pop());
    }

    @Test
    public void removeLastItemFromStack(){
        MyStack stack = new MyStack();
        stack.push(5);
        stack.pop();
        assertNull("Top is null when last item is removed", stack.getTop());

    }

}

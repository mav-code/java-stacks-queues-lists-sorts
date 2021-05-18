package stacks.queues.java;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MyNodeTest {
    // Node Test

    @Test
    public void canCreateNode(){
        MyNode node = new MyNode(3);
        assertNotNull("can create new Node object", node);
    }
}

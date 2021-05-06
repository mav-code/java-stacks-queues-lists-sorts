package stacks.queues.java;

public class MyQueue {

    private MyNode head;
    private MyNode tail;

    public MyNode getHead() {
        return head;
    }


    public MyNode getTail() {
        return tail;
    }

    public boolean isEmpty(){
        return (head == null);
    }

    public Object peek() {
        if (head != null) {
            return head.data;
        }
        return null;
    }

    public void add (Object data){
        MyNode node = new MyNode(data);
        if (tail != null){
            tail.next = node;
        }
        tail = node;
        if (head == null){
            head = node;
        }
    }

    public Object remove(){
//        if (head == null) {
//            throw new NullPointerException("Cannot remove from empty queue");
//        }
        Object data = head.data;
        head = head.next;
        if (head == null){
            tail = null;
        }
        return data;
    }
}

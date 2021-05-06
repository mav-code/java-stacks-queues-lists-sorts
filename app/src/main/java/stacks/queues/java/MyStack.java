package stacks.queues.java;

public class MyStack {

    private MyNode top;

    public MyNode getTop() {
        return top;
    }

    public boolean isEmpty(){
        return (top == null);
    }

    public Object peek(){
        if (top != null) {
            return top.data;
        }
        return null;
    }

    public void push(Object data){
        MyNode node = new MyNode(data);
        node.next = top;
        top = node;
    }

    public Object pop(){
        Object data = top.data;
        top = top.next;
        return data;
    }

}

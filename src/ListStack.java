import List.LinkedList;

/**
 * @author James MacKenzie
 */

public class ListStack implements IStack {

    private LinkedList stack;

    public ListStack() {
        stack = new LinkedList();
    }

    @Override
    public void push(int item) {
        stack.addToFront(item);
    }

    @Override
    public int pop() {
        return stack.removeFront();
    }

    @Override
    public int peek() {
        return stack.peekAtFront();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int size() {
        return stack.size();
    }
    @Override
    public void display() {
        int size = stack.size();
        System.out.println("list has " + stack.size() + " items");
        for (int i = 0; i< size; i++) {
            System.out.println("value " + stack.removeFront());
        }
        for (int i = 1; i<size+1; i++) {
            stack.addToFront(i);
        }
    }
}
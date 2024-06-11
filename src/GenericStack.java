
import java.util.ArrayList;

public class GenericStack<T> {
    private ArrayList<T> stack;

    public GenericStack() {
        stack = new ArrayList<>();
    }
    public void push(T item) {
        stack.add(item);
    }
    public T pop() {
        if (!isEmpty()) {
            return stack.remove(stack.size() - 1);
        }
        return null;
    }
    public T peek() {
        if (!isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        return null;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public int size() {
        return stack.size();
    }}
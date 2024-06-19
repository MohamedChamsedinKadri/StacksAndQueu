import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MoveQueutoStack {

    public static Stack<Integer> moveQueueToStack(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        return stack;
    }}



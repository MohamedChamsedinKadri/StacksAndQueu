import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MoveStacktoQueue {
    public static Queue<Integer> moveStackToQueue(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        return queue;
    }
}
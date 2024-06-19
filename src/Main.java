import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Test moveStackToQueue
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Original Stack: " + stack);
        Queue<Integer> queueFromStack = MoveStacktoQueue.moveStackToQueue(stack);
        System.out.println("Queue after moving from Stack: " + queueFromStack);

        // Test moveQueueToStack
        Queue<Integer> queue = new LinkedList<>();
        queue.add(4);
        queue.add(5);
        queue.add(6);
        System.out.println("Original Queue: " + queue);
        Stack<Integer> stackFromQueue = MoveQueutoStack.moveQueueToStack(queue);
        System.out.println("Stack after moving from Queue: " + stackFromQueue);

        // Test moveStackStack
        Stack<Integer> sourceStack = new Stack<>();
        sourceStack.push(7);
        sourceStack.push(8);
        sourceStack.push(9);
        Stack<Integer> targetStack = new Stack<>();
        System.out.println("Source Stack: " + sourceStack);
        System.out.println("Target Stack before moving: " + targetStack);
        MoveStackStack.moveStackStack(sourceStack, targetStack);
        System.out.println("Source Stack after moving: " + sourceStack);
        System.out.println("Target Stack after moving: " + targetStack);

        // Test analyseInput
        char result = AnalyseInput.analyseInput();
        System.out.println("Analyse Input Result: " + result);
    }
}
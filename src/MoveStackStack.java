import java.util.Stack;

public class MoveStackStack {
    public static void moveStackStack(Stack <Integer> source,Stack <Integer> target ){
        Stack<Integer> temp =new Stack<>();
        while (!source.isEmpty()){
            temp.push(source.pop());
        }
        while (!temp.isEmpty()){
            target.push(temp.pop());
        }
    }
}

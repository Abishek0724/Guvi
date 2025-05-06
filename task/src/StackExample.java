import java.util.Stack;

public class StackExample {
    static Stack<Integer> stack = new Stack<>();

  
    public static void pushElement(int value) {
        stack.push(value);
        System.out.println(value + " pushed onto the stack.");
    }

   
    public static void popElement() {
        if (!stack.isEmpty()) {
            int value = stack.pop();
            System.out.println(value + " popped from the stack.");
        } else {
            System.out.println("Stack is empty. Nothing to pop!");
        }
    }

    public static void main(String[] args) {
        pushElement(10);
        pushElement(20);
        pushElement(30);

        popElement();
        popElement();
        popElement();
        popElement();  
    }
}

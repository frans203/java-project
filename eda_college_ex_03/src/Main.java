public class Main {
    public static void main(String[] args) {
       Stack stack = new Stack(10);
        stack.push(10);
        stack.push(9);
        stack.push(13);
        System.out.println(stack.isEmpty());
        stack.pop();
        System.out.println(stack.top());
        stack.pop();
        stack.pop();
        System.out.println(stack.pop());
        System.out.println("size: " + stack.size());
        stack.printStack();
    }
}
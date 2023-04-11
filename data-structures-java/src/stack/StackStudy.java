package stack;

import java.util.Stack;

public class StackStudy {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        String myFavGame = stack.pop();
        System.out.println(myFavGame);
        System.out.println(stack.peek());
        System.out.println(stack.search("DMC"));
        //HEAP OUT OF MEMORY ERROR
//        for(int i = 0;i < 1000000000;i++){
//            stack.push("Fallout");
//        }
        System.out.println(stack);
    }

}

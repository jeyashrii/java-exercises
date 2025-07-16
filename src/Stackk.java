import java.util.Stack;

public class Stackk {
    public static void main(String[]args){
         Stack<String> stack=new Stack<String>();
         System.out.println(stack.isEmpty());
         stack.push("a");
         stack.push("b");
         System.out.println(stack.peek());

         System.out.println(stack);
    }
}

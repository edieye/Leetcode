import java.util.Stack;

/**
 * Created by edieye on 2019-10-19.
 */
public class MinStack {

        /** initialize your data structure here. */
        Stack<Integer> stack;
        Stack<Integer> min;
        public MinStack() {
            stack = new Stack();
            min = new Stack();
        }

        public void push(int x) {
            stack.push(x);
            if (min.isEmpty() || min.peek() > x){
                min.push(x);
            }
        }

        public void pop() {
            if (stack.peek() == min.peek()){
                min.pop();
            }
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min.peek();
        }
}


import java.util.Stack;

public class MinStack {
    Stack<Integer> dataStack =new Stack<Integer>();
    Stack<Integer> minStack =new Stack<Integer>();
    public void push(int node) {
        dataStack.push(node);
        //判断空栈的条件应该放在第一个条件
        if(minStack.isEmpty()||node<minStack.peek())
            minStack.push(node);
        else
            minStack.push(minStack.peek());
    }
    
    public void pop() {
        dataStack.pop();
        minStack.pop();
    }
    
    public int top() {
        return dataStack.peek();
    }
    
    public int min() {
        return minStack.peek();
    }

}

import java.util.Stack;

public class TwoStacktoAQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {

    	if(stack1.empty()&&stack2.empty()){
    		throw new RuntimeException("Queue is empty!");
    	}
    	if(stack2.isEmpty()) {
    		while(stack1.isEmpty()==false) {
    			stack2.push(stack1.pop());
    		}
    	}
    	return stack2.pop();
    }

}

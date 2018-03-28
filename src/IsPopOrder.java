import java.util.Stack;

public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int lengthofpush=pushA.length,lengthofpop=popA.length,count=0,index=0;
        boolean flag=false;
        Stack<Integer> stack=new Stack<Integer>();
        if(lengthofpush!=lengthofpop || lengthofpop==0)
            return flag;
        while(count<lengthofpush){
            int pop=popA[count++];
            if(stack.isEmpty() || stack.peek()!=pop){
                while(index<lengthofpush && pushA[index]!=pop ){
                    stack.push(pushA[index++]);
                }
                if(index<lengthofpush && pushA[index]==pop)
                    stack.push(pushA[index++]);
            }
            if (stack.isEmpty()==false && stack.peek()==pop){
                stack.pop();
            }
        }
        if(stack.isEmpty() && index==lengthofpush && count==lengthofpop)
            flag=true;
        return flag;
    }
}
/*
public boolean IsPopOrder(int [] pushA,int [] popA) {
        int lengthofpush=pushA.length,lengthofpop=popA.length,index=0;
        Stack<Integer> stack=new Stack<Integer>();
        if(lengthofpush!=lengthofpop || lengthofpop==0)
            return false;
        for(int i=0;i<lengthofpush;i++){
            stack.push(pushA[i]);
            while(!stack.isEmpty() && stack.peek()==popA[index]){
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    } 
}
    */

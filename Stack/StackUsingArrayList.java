package Stack;

import java.util.ArrayList;

public class StackUsingArrayList {
    static class Stack{
        ArrayList<Integer> list = new ArrayList<>();
        // is empty
        public boolean isEmpty(){
            return list.isEmpty();
        }
        // push
        public void push(int data){
            list.add(data);
        }
        // pop
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.removeLast();
            return top;
        }
        // peek
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

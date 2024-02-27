package main.java.com.eugene.algorithms.Stack;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    class MyQueue {
        private Stack<Integer> enqueueStack;
        private Stack<Integer> dequeueStack;
        public MyQueue() {
            enqueueStack = new Stack<>();
            dequeueStack = new Stack<>();

        }

        public void push(int x) {
            enqueueStack.push(x);
        }

        public int pop() {
            // if dequeueStack is not empty, the first thing on the dequeueStack is the first-in element.
            if(dequeueStack.isEmpty()){
                // transfer elements from enqueueStack to dequeueStack
                while(!enqueueStack.isEmpty()){
                    dequeueStack.push(enqueueStack.pop());
                }
            }
            return dequeueStack.pop();
        }

        public int peek() {
            if(dequeueStack.isEmpty()){
                // transfer elements from enqueueStack to dequeueStack
                while(!enqueueStack.isEmpty()){
                    dequeueStack.push(enqueueStack.pop());
                }
            }
            return dequeueStack.peek();
        }

        public boolean empty() {
            return dequeueStack.isEmpty() && enqueueStack.isEmpty();
        }
    }
}

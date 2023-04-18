package stack;

import list.Employee;

import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] stack;
    private int top; //index of the next available position in the
    // array

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee){
        if(top == stack.length){ //we know the array is full
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        } //time complexity O(n)

        stack[top++] = employee; //assign the employee into top and
        // just after that we'll increment it
    }

    public Employee pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }

        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public Employee peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }

        Employee employee = stack[top - 1];

        return employee;
    }

    public int size() {
        return top;
    }


    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {
        for(int i = top - 1; i >= 0 ;i--){
            System.out.println(stack[i]);
        }
    }
}

package stack_elaboration_app;

public class StackADT {

    //required data fields
    int[] stack;
    int size;
    int top;

    //constructor
    StackADT(int s) {
        this.size = s;
        top = -1;

        stack = new int[size];
    }

    //supporting methods
    //returns true if the stack is empty
    boolean isEmpty() {

        return top == -1;

    }

    //returns true if the stack is full
    boolean isFull() {

        return top == size - 1;

    }

    //push method
    void push(int a) {
        if (!isFull()) {

            top++;
            stack[top] = a;

            System.out.print("Pushed: " + a);
        } else {
            System.out.println("Stack Overflow detected");
        }
    }

    //pop method
    int pop() {
        if (!isEmpty()) {

            int num;

            num = stack[top];

            top--;

            System.out.println("Popped out:" + num);
            return num;

        } else {
            System.out.println("Stack underflow");

            return -1;
        }

    }

    public void display(int[] st, int max_size) {
        int i;
        System.out.println("Stack Elements:");
        for (i = 0; i <= max_size; i++) {
            System.out.println(st[i]);
        }
    }

}


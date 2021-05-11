public class Stack {
    private int stck[] = new int[10];
    private int top_of_stack;

    Stack() {
        top_of_stack = -1;
    }

    void push(int item) {
        if (top_of_stack == 9) {
            System.out.println("Stack is full!");
        }
        else {
            stck[++top_of_stack] = item;
        }
    }

    int pop() {
        if (top_of_stack < 0) {
            System.out.println("Stack underflow!");
            return 0;
        }
        else {
            return stck[top_of_stack--];
        }
    }

    void showStack() {
        for(int i = top_of_stack; i >= 0; i--) {
            System.out.println(stck[i]);
        }
    }
}

public class StackDriver {
    public static void main (String [] args) {
        Stack s1 = new Stack();

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.showStack();
        System.out.println();
        System.out.println("Element at the top of the stack is: " + s1.pop());
        System.out.println("After popping one element, the stack is : ");
        s1.showStack();
    }
}

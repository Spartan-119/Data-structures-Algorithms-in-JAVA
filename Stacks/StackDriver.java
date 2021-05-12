public class StackDriver {
    public static void main (String [] args) {
        Stack s1 = new Stack(10);

        for(int i = 1; i <= 10; i++){
            s1.push(i);
        }
        s1.showStack();
        System.out.println();
        System.out.println("Element at the top of the stack is: " + s1.pop());
        System.out.println("After popping one element, the stack is : ");
        s1.showStack();
    }
}

public class ArrayTestDriver {
    public static void main (String [] args) {
        char [] arr = {'A', 'B', 'C', 'D', 'E'};

        // inserting a new element
        ArrayTest.insert(arr, 3, 'X');

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

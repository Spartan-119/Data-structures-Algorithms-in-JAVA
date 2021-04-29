public class ArrayTest {
    // inserting an element in an array
    public static void insert(char [] ar, int pos, char val) {
        //traversing the array from the last position to the position where insertion has to be made
        for (int i = ar.length-1; i >= pos; i--) {
            // moving each element one to its right
            ar[i] = ar[i-1];
        }

        // inserting the data at that position
        ar[pos-1] = val;
    }
}

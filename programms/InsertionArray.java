import java.util.Arrays;

public class InsertionArray {
    int arr[] = null;
    
    public InsertionArray(int size) {
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    // O(1)
    public void insert(int location, int valueToBeInserted) {
        try {
            if(arr[location] == Integer.MIN_VALUE) { // O(1)
                arr[location] = valueToBeInserted; // O(1)
                System.out.println("Successfully inserted"); // O(1)
            } else {
                System.out.println("This cell is already occupied"); // O(1)
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!"); // O(1)
        }
    }

    // public static void main(String[] args) {
    //     InsertionArray foo = new InsertionArray(2);
    //     System.out.println(Arrays.toString(foo.arr));
    //     foo.insert(0, 0);
    //     System.out.println(Arrays.toString(foo.arr));
    //     foo.insert(1, 1);
    //     System.out.println(Arrays.toString(foo.arr));
    //     foo.insert(2, 2);
    //     System.out.println(Arrays.toString(foo.arr));
    // }
}

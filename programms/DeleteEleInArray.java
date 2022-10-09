import java.util.Arrays;

public class DeleteEleInArray {
    public static void main(String[] args) {
        InsertionArray oneDArray = new InsertionArray(3);
        DeleteEleInArray main = new DeleteEleInArray();

        oneDArray.insert(0, 10);
        oneDArray.insert(1, 20);
        oneDArray.insert(2, 30);
        oneDArray.insert(3, 40);
        oneDArray.insert(4, 50);
        
        System.out.println("Before Delete Operation"+Arrays.toString(oneDArray.arr));
        main.deleteElementFromArray(0, oneDArray.arr);
        System.out.println("Before Delete Operation"+Arrays.toString(oneDArray.arr));
    }

    // TC O(1), SC O(1)
    public void deleteElementFromArray(int valueToDeleteIndex, int[] array) {
        try {
            array[valueToDeleteIndex] = Integer.MIN_VALUE; // O(1)
            System.out.println("The value has been deleted successfully"); // O(1)
        } catch (Exception e) {
            System.out.println("The value that is provided is not in the range of array"); // O(1)
        }
    }
}

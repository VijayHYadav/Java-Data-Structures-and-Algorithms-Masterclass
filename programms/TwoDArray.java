/**
 * TwoDArray
 */
public class TwoDArray {
    int arr[][] = null;

    // Constructor
    public TwoDArray(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // Inserting value in the Array // TC O(1) SC //O(1)
    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) { //O(1)
                arr[row][col] = value; //O(1)
                System.out.println("The value is successfully inserted"); //O(1)
            } else {
                System.out.println("This cell is already occupied"); //O(1)
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array"); //O(1)
        }
    }
}
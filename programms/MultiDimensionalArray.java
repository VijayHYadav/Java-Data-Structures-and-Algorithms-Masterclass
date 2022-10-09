import java.util.Arrays;

// Space Complexity of 2DArray is O(mn)
public class MultiDimensionalArray {

    public static void main(String[] args) {
        // Step 1 - Declare
        int[][] int2DArray; // O(1)

        // Step 2 - Instantiate
        int2DArray = new int[2][2]; // O(1)

        // Step 3 - Initialize
        int2DArray[0][0] = 1; // O(1)
        int2DArray[0][1] = 2; // O(1)
        int2DArray[1][0] = 3; // O(1)  O(mn)
        int2DArray[1][1] = 4; // O(1)

        System.out.println(Arrays.deepToString(int2DArray));

        // All together
        String s2DArray[][] = {{"a","c"},{"c","d"}}; //O(1)
        System.out.println(Arrays.deepToString(s2DArray));

    }
}
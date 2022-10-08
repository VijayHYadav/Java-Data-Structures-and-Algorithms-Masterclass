public class PrintPairs {
    public static void main(String[] args) {
        PrintPairs printPairs = new PrintPairs();
        int[] custArray = {1,2,3,4};
        printPairs.displayPairs(custArray);
    }

    // O(N)
    void displayPairs(int [] array) {
        for (int i = 0; i < array.length; i++) { // O(N)
            for (int j = 0; j < array.length; j++) { // O(N)
                System.out.println(array[i]+", "+array[j]); // O(1)
            }
        }
    }
}
// O(N) * O(N) = O(N^2)
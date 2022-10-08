public class SumNProjectOfArray {
    public static void main(String[] args) {
        SumNProjectOfArray main = new SumNProjectOfArray();
        int[] customArray = {1,2,3,4};
        main.spofArray(customArray);
    }

    // Time Complexity O(N)
    void spofArray(int [] array) {
        int sum = 0; // O(1)
        int product = 1; // O(1)
        for (int i = 0; i < array.length; i++) { // O(N)
            sum += array[i]; // O(1)
        }
        for (int i = 0; i < array.length; i++) { // O(N)
            product *= array[i]; // O(1)
        }
        System.out.println(sum+" : "+product); // O(1)
    }
}

import java.util.Arrays;

class CreateArray {
    public static void main(String[] args) {

        int[] intArray; //O(1)
        intArray = new int[3]; //O(1)
        System.out.println(Arrays.toString(intArray)); //O(1)
        intArray[0] = 0; //O(1)
        intArray[1] = 1; //O(1)   //O(N)
        intArray[2] = 2; //O(1)
        System.out.println(Arrays.toString(intArray));

        // All together
        String sArray[] = {"A", "B", "C"}; //O(1)
        System.out.println(Arrays.toString(sArray)); //O(1)
    }
}
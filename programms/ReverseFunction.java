import java.util.Arrays;

public class ReverseFunction {
    public static void main(String[] args) {
        ReverseFunction reverseFunction = new ReverseFunction();
        int[] customArray = {1,2,3,4};
        reverseFunction.reverse(customArray);
    }

    // O(N)
    void reverse (int [] array) {
        for (int i = 0; i < array.length/2; i++) { //O(N/2) --> //O(N)
            int other = array.length-i-1;//O(1)
            int temp = array[i];//O(1)
            array[i] = array[other];//O(1)
            array[other] = temp;//O(1)
        }
        System.out.println(Arrays.toString(array));//O(1)
    }
}

// i = 0
// other = 3
// temp = 1
// [4,2,3,1]

// i = 1
// other = 2
// temp = 2
// [4,3,2,1]


// [1,2,3,4]
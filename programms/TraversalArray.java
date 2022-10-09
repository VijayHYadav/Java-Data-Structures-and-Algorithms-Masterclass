public class TraversalArray {

    public static void main(String[] args) {
        InsertionArray accessArray = new InsertionArray(5);
        accessArray.insert(0, 10);
        accessArray.insert(1, 20);
        accessArray.insert(2, 30);
        accessArray.insert(3, 40);
        accessArray.insert(4, 50);

        // TC O(N) SC O(1)
        try {
            for (int i = 0; i < accessArray.arr.length; i++) { //O(N)
                System.out.print(accessArray.arr[i] + " ");//O(1)
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists!");//O(1)
        }
    }
}

public class SearchEleInArray {
    
    //O(N)
    public void searchInArray(int valueToSearch, int[] array) {
        for (int i = 0; i < array.length; i++) { // O(N)
            if (array[i] == valueToSearch) { //O(1)
                System.out.println("Value is found at the index of "+ i); //O(1)
                return; //O(1)
            }
        }
        System.out.println(valueToSearch+" Value is not found"); //O(1)
    }

    public static void main(String[] args) {
        InsertionArray accessArray = new InsertionArray(5);
        accessArray.insert(0, 10);
        accessArray.insert(1, 20);
        accessArray.insert(2, 30);
        accessArray.insert(3, 40);
        accessArray.insert(4, 50);

        SearchEleInArray foo = new SearchEleInArray();
        foo.searchInArray(20, accessArray.arr);
        foo.searchInArray(202, accessArray.arr);
    }
}


public class AccessingArray {
    
    public static void main(String[] args) {
       InsertionArray accessArray = new InsertionArray(5);
       accessArray.insert(0, 10);
       accessArray.insert(1, 20);
       accessArray.insert(2, 30);
       accessArray.insert(3, 40);
       accessArray.insert(4, 50);

       var firstEle = accessArray.arr[0]; //O(1) bcox we know the addr location of element
       System.out.println(firstEle);
       var thirdEle = accessArray.arr[3]; //O(1)
       System.out.println(thirdEle);
       var sixEle = accessArray.arr[6]; //O(1)
       System.out.println(sixEle);
    }
}

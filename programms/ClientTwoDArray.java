import java.util.Arrays;

public class ClientTwoDArray {
    public static void main(String[] args) {
        TwoDArray twoDArray = new TwoDArray(3,3);
         twoDArray.insertValueInTheArray(0, 0, 10);
         twoDArray.insertValueInTheArray(0, 1, 20);
         twoDArray.insertValueInTheArray(0, 2, 30);
         twoDArray.insertValueInTheArray(1, 0, 40);
         twoDArray.insertValueInTheArray(1, 1, 50);
         twoDArray.insertValueInTheArray(1, 2, 60);
         twoDArray.insertValueInTheArray(2, 0, 70);
         twoDArray.insertValueInTheArray(2, 1, 80);
         twoDArray.insertValueInTheArray(2, 2, 90);

         System.out.println(Arrays.deepToString(twoDArray.arr));

         twoDArray.accessCell(2, 2);
         twoDArray.accessCell(2, 3);

    }
}

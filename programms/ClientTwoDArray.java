import java.util.Arrays;

public class ClientTwoDArray {
    public static void main(String[] args) {
        TwoDArray twoDArray = new TwoDArray(3,3);
        twoDArray.insertValueInTheArray(0, 0, 10);
        twoDArray.insertValueInTheArray(0, 0, 10);
        System.out.println(Arrays.deepToString(twoDArray.arr));
    }
}

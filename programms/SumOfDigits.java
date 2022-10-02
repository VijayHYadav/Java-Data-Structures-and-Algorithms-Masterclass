// visual Images/2022-10-02-14-44-20.png

public class SumOfDigits {
    public static void main(String[] args) {
        SumOfDigits sumOfDigits = new SumOfDigits();
        var result = sumOfDigits.sumOfDigitsAlgo(1111);
        System.out.println(result);        
    }

    public int sumOfDigitsAlgo(int n) {
        if (n==0 || n<0) {
            return 0;
        }
        // f(n) = n%10 + f(n/10) => mathmatical expression
        return n%10 + sumOfDigitsAlgo(n / 10);
    }
}

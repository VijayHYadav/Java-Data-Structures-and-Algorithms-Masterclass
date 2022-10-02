public class DecimalToBinary {
    public static void main(String[] args) {
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        var result = decimalToBinary.decimalToBinaryAlgo(10);
        System.out.println(result);
        
    }

    public int decimalToBinaryAlgo(int n) {
        if (n == 0) {
            return 0;
        }
        return n%2 + 10*decimalToBinaryAlgo(n/2);
    }
}

public class GCD {
    public static void main(String[] args) {
        GCD gcd = new GCD();
        var result = gcd.gcdAlgo(8, 12);
        System.out.println(result);
    }

    public int gcdAlgo(int a, int b) {
        if (a<0 || b<0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        
        // Euclidean Algorithm
        // gcd(a, 0) = a
        // gcd(a, b) = gcd(b, a mod b)

        return gcdAlgo(b, a%b);
    }
}

// Please find image for visual -> Images/2022-10-02-10-46-16.png
class FactorialRecursion {
    public static void main(String[] args) {
        FactorialRecursion r = new FactorialRecursion();
        var output = r.factorial(4);
        System.out.println(output);
    }

    public int factorial(int n) {
        if (n<1) return -1;
        if (n==0 || n==1) return 1;
        return n * factorial(n-1);
    }
}

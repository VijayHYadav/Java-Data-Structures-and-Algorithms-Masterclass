class FactorialRecusrion {
    public static void main(String[] args) {
        FactorialRecusrion r = new FactorialRecusrion();
        var output = r.factorial(4);
        System.out.println(output);
    }

    public int factorial(int n) {
        if (n<1) return -1;
        if (n==0 || n==1) return 1;
        return n * factorial(n-1);
    }
}
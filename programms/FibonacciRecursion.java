// Please find image for visual -> Images/2022-10-02-11-36-22.png
public class FibonacciRecursion {
    public static void main(String[] args) {
        FibonacciRecursion fibonacciRecursion = new FibonacciRecursion();
        var output = fibonacciRecursion.fibonacci(3);
        System.out.println(output);       
    }

    public int fibonacci(int n) {
        if (n<0) return -1;
        if (n==0 || n==1) return n;
        return fibonacci(n-1) + fibonacci(n - 2);
    }
}

// 1,1,2,3,5,8
// fibonacci = fibonacci(n-1) + fibonacci(n-1);
// fibonacci(6) = 5 + 3
// 8 = fibonacci(6)
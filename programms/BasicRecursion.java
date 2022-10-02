public class BasicRecursion {
    static void recursiveMethod(int n) {
        if (n<1) {
            System.out.println("n is less than 1");
        } else {
            System.out.println("Before method call :"+n);
            recursiveMethod(n-1);
            System.out.println("After method call :"+n);
        } 
    }
    public static void main(String[] args) {
        recursiveMethod(4);
    }
}

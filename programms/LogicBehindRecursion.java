public class LogicBehindRecursion {
    static void firstMethod() {
        secondMethod();
        System.out.println("firstMethod");
    }
    static void secondMethod() {
        thirdMethod();
        System.out.println("secondMethod");
    }
    static void thirdMethod() {
        fourthMethod();
        System.out.println("thirdMethod");
    }
    static void fourthMethod() {
        System.out.println("fourthMethod");
    }

    public static void main(String[] args) {
        firstMethod();
    }
}

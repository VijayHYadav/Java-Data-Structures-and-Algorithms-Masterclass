public class PowerOfNumber {
    public static void main(String[] args) {
        PowerOfNumber power = new PowerOfNumber();
        var result = power.powerOfNumberAlgo(2,2);
        System.out.println(result);
    }
    
    int powerOfNumberAlgo (int base, int exp) {
        if (exp<0) {
            return -1;
        }

        // if (exp==0 || exp==1) {
        //     return base;
        // }
        // return base * powerOfNumberAlgo(base, exp-1);

        switch (exp) {
            case 0:
                return base;
            case 1:
                return base;
            default:
                return base * powerOfNumberAlgo(base, exp-1);
        }
    }
}

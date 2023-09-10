// Aaron Prince Anu

class Exponent {
    public static void main(String[] args) {
        // input
        System.out.println("What's your x value?");
        double x = In.getInt();

        // vars
        double term = x;
        double finito = 1;
        double count = 1;
        final double LOW_TERM = 1/exponent(10, 15);

        // make terms
        while (term > LOW_TERM * (Math.abs(finito))) {
            term = exponent(x, count) / factorial(count);
            finito += term;
            count++;
        }

        //* output
        System.out.println("The number is " + finito);
    }

    public static double exponent (double base, double power) {
        
        double output = 1;

        // if base is 0
        if (base == 0) {
            return 1;
        }

        // exponent
        for (int i = 0; i < power; i++) {
                output *= base;
        }

        return output;
    }

    public static double factorial (double factor) {

        double digit = factor;

        for (double i = factor - 1; i > 0; i--) {
            digit *= factor - i;
        }

        return digit;
    }
}
// Aaron Prince Anu

class Exponent {
    public static void main(String[] args) {
        // Input
        System.out.println("What's your x value?");
        double x = In.getInt();
        exponent(x, x);
        factorial(x);
    }

    public static void exponent (double base, double power) {
        
        double output = 1;

        for (int i = 0; i < power; i++) {
                output *= base;
            }

        System.out.println(output);
    }

    public static void factorial (double factor) {
        // TODO take a number (n), multiply by (n - 1), then (n - 1) - 1, until 1

        System.out.println(factor);

        double finito = factor;
        double fact = 1;

        for (int i = 1; i <= finito; i++) {
            fact = fact*i;
        }

        System.out.println(fact);
    }
}
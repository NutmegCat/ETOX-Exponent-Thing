// Aaron Prince Anu

class Exponent {
    public static void main(String[] args) {
        // Input
        System.out.println("What's your x value?");
        double x = In.getInt();
        exponent(x, x);
    }

    public static void exponent (double base, double power) {
        
        double output = 1;

        for (int i = 0; i < power; i++) {
                output *= base;
            }

        System.out.println(output);
    }

    public static void factorial () {
        // TODO take a number (n), multiply by (n - 1), then (n - 1) - 1, until 1
    }
}
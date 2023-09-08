// Aaron Prince Anu

class Exponent {
    public static void main(String[] args) {
        // Input
        System.out.println("What's your x value?");
        int x = In.getInt();
        exponent(x, x);
    }

    public static void exponent (double base, double power) {
        
        double output = 1;

        for (int i = 0; i < power; i++) {
                output *= base;
            }

        System.out.println(output);
    }
}
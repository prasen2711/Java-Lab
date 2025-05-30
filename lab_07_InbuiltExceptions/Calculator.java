public class Calculator {

    /**
     * Adds two numbers.
     *
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts second number from the first.
     *
     * @param a first number
     * @param b second number
     * @return difference of a and b
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     *
     * @param a first number
     * @param b second number
     * @return product of a and b
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides first number by second number.
     *
     * @param a dividend
     * @param b divisor
     * @return result of a / b
     * @throws ArithmeticException if b is zero
     */
    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    /**
     * Squares a number.
     *
     * @param a number
     * @return a * a
     */
    public static double square(double a) {
        return a * a;
    }

    /**
     * Cubes a number.
     *
     * @param a number
     * @return a * a * a
     */
    public static double cube(double a) {
        return a * a * a;
    }

    /**
     * Finds the square root of a number.
     *
     * @param a the number
     * @return square root of a
     * @throws ArithmeticException if a is negative
     */
    public static double squareRoot(double a) throws ArithmeticException {
        if (a < 0) {
            throw new ArithmeticException("Cannot take square root of a negative number");
        }
        return Math.sqrt(a);
    }
}

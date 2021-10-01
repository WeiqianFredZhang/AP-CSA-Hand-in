/*
    Problem Set 2-A Solution
    Fred Zhang
    Sept 20th
 */

public class Calculator {
    // returns both possible quadratic solutions using the quadratic formula
    // return type: double[]
    double[] quadraticFormula(double a, double b, double c) {
        return new double[]{(-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a), (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a)};
    }

    // returns slope using the slope formula
    // return type: double
    double calculateSlope(double x1, double x2, double y1, double y2) {
        return (y2 - y1) / (x2 - x1);
    }

    // returns the midpoint coordinates using the midpoint formula
    // return type: double[]
    double[] midPoint(double x1, double x2, double y1, double y2) {
        return new double[]{(x1 + x2) / 2, (y1 + y2) / 2};
    }

    // returns the sum of the arithmetic series
    // return type: double
    double arithmeticSum(double k, double a_1, double d) {
        double a_k = a_1 + (k - 1) * d;
        return (k / 2) * (a_1 + a_k);
    }

    // returns the sum of the geometric series
    // return type: double
    double geometricSum(double g_1, double r, double k) {
        return g_1 * ((1 - Math.pow(r, k)) / (1 - r));
    }

    // calls all methods in the class and output the solutions
    // return type: void
    void display() {
        // the declared variable a is the coefficient of x^2, b is the coefficient of x, and c is a constant
        double a = 1, b = 5, c = 6;
        // declares two coordinate pairs: (x1, y1) and (x2, y2)
        double x1 = 0, x2 = 2, y1 = 0, y2 = 3;
        // the declared variable k_a is the number of terms in the arithmetic sequence, a_1 is the first term of the arithmetic sequence, and d is the difference between each term in the sequence
        double k_a = 5, a_1 = 1, d = 1;
        // the declared variable g_1 is the first term of the geometric sequence, r is the common ratio between each term, and k_g is the number of terms in the geometric sequence
        double g_1 = 3, r = 2, k_g = 3;

        // outputs the quadratic coefficients and this quadratic function's solutions
        System.out.println("QUADRATIC FORMULA\nThe solutions for " + (int) a + "x^2 + " + (int) b + "x + " + (int) c + " are " + quadraticFormula(a, b, c)[0] + " and " + quadraticFormula(a, b, c)[1] + ".\n");
        // stores the String version of the coordinate pairs
        String coordinatePairs = "(" + (int) x1 + ", " + (int) y1 + ") and (" + (int) x2 + ", " + (int) y2 + ")";
        // outputs the slope of the two coordinate pairs
        System.out.println("SLOPE FORMULA\nA line connecting the points " + coordinatePairs + " has a slope of " + calculateSlope(x1, x2, y1, y2) + "\n");
        // outputs the midpoint coordinate pair
        System.out.println("MIDPOINT FORMULA\nThe midpoint between " + coordinatePairs + " is (" + midPoint(x1, x2, y1, y2)[0] + ", " + midPoint(x1, x2, y1, y2)[1] + ")\n");
        // outputs the arithmetic sequence's start, end, and difference. then outputs its sum
        System.out.println("SUM OF AN ARITHMETIC SERIES\nThe sum of the first " + (int) k_a + " terms of an arithmetic series that starts with " + a_1 + " and increases by " + d + " is " + arithmeticSum(k_a, a_1, d) + "\n");
        // outputs the geometric sequence's start term and common ratio. then outputs its sum
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES\nThe sum of the first " + (int) k_g + " terms of a finite geometric series that starts with " + g_1 + " and increases by a rate of " + r + " is " + geometricSum(g_1, r, k_g));
    }
}

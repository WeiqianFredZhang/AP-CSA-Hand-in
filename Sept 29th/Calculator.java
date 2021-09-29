/*
    Problem Set 2-A Solution
    Fred Zhang
    Sept 20th
 */

public class Calculator {
    double[] quadraticFormula(double a, double b, double c) {
        return new double[]{(-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a), (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a)};
    }

    double calculateSlope(double x1, double x2, double y1, double y2) {
        return (y2 - y1) / (x2 - x1);
    }

    double[] midPoint(double x1, double x2, double y1, double y2) {
        return new double[]{(x1 + x2) / 2, (y1 + y2) / 2};
    }

    double arithmeticSum(double k, double a_1, double d) {
        double a_k = a_1 + (k - 1) * d;
        return (k / 2) * (a_1 + a_k);
    }

    double geometricSum(double g_1, double r, double k) {
        return g_1 * ((1 - Math.pow(r, k)) / (1 - r));
    }

    void display() {
        double a = 1, b = 5, c = 6;
        double x1 = 0, x2 = 2, y1 = 0, y2 = 3;
        double k_a = 5, a_1 = 1, d = 1;
        double g_1 = 3, r = 2, k_g = 3;

        System.out.println("QUADRATIC FORMULA\nThe solutions for " + (int) a + "x^2 + " + (int) b + "x + " + (int) c + " are " + quadraticFormula(a, b, c)[0] + " " + quadraticFormula(a, b, c)[1] + ".\n");
        String coordinatePairs = "(" + (int) x1 + ", " + (int) y1 + ") and (" + (int) x2 + ", " + (int) y2 + ")";
        System.out.println("SLOPE FORMULA\nA line connecting the points " + coordinatePairs + " has a slope of " + calculateSlope(x1, x2, y1, y2) + "\n");
        System.out.println("MIDPOINT FORMULA\nThe midpoint between " + coordinatePairs + " is (" + midPoint(x1, x2, y1, y2)[0] + ", " + midPoint(x1, x2, y1, y2)[1] + ")\n");
        System.out.println("SUM OF AN ARITHMETIC SERIES\nThe sum of the first " + (int) k_a + " terms of an arithmetic series that starts with " + a_1 + " and increases by " + d + " is " + arithmeticSum(k_a, a_1, d) + "\n");
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES\nThe sum of the first " + (int) k_g + " terms of a finite geometric series that starts with " + g_1 + " and increases by a rate of " + r + " is " + geometricSum(g_1, r, k_g));
    }
}

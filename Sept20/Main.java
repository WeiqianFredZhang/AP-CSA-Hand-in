/*
    Problem Set 1-A Solution
    Fred Zhang
    Sept 20th
 */

public class Main {
    public static void main(String[] args) {
        // declared a is the coefficient of x^2, b is the coefficient of x, and c is a constant
        double a = 1, b = 5, c = 6;
        // calculates one possible quadratic solution using the quadratic formula
        double rootOne = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        // calculates the other possible quadratic solution using the quadratic formula
        double rootTwo = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        // outputs the quadratic coefficients and this quadratic function's solution
        System.out.println("QUADRATIC FORMULA\nThe solutions for " + (int) a + "x^2 + " + (int) b + "x + " + (int) c + " are " + rootOne + " " + rootTwo + ".\n");


        // declares two coordinate pairs: (x1, y1) and (x2, y2)
        double x1 = 0, x2 = 2, y1 = 0, y2 = 3;
        // calculates the slope using the slope formula
        double slope = (y2 - y1) / (x2 - x1);
        // stores the String version of the coordinate pairs
        String coordinatePairs = "(" + (int) x1 + ", " + (int) y1 + ") and (" + (int) x2 + ", " + (int) y2 + ")";
        // outputs the slope of the two coordinate pairs
        System.out.println("SLOPE FORMULA\nA line connecting the points " + coordinatePairs + " has a slope of " + slope + "\n");


        // calculates the midpoint coordinates using the midpoint formula
        double midPointX = (x1 + x2) / 2, midPointY = (y1 + y2) / 2;
        // outputs the midpoint coordinate pair
        System.out.println("MIDPOINT FORMULA\nThe midpoint between " + coordinatePairs + " is (" + midPointX + ", " + midPointY + ")\n");


        // declared k is the number of terms in the arithmetic sequence, a_1 is the first term of the arithmetic sequence, and d is the difference between each term in the sequence
        double k = 5, a_1 = 1, d = 1;
        // calculates the kth term of the arithmetic sequence
        double a_k = a_1 + (k - 1) * d;
        // calculates the sum of the arithmetic series
        double arithmeticSum = (k / 2) * (a_1 + a_k);
        // outputs the arithmetic sequence's start, end, and difference. then outputs its sum
        System.out.println("SUM OF AN ARITHMETIC SERIES\nThe sum of the first " + (int) k + " terms of an arithmetic series that starts with " + a_1 + " and increases by " + d + " is " + arithmeticSum + "\n");


        // declared g_1 is the first term of the geometric sequence and r is the common ratio between each term
        double g_1 = 3, r = 2;
        // updates the value of k, which is now the number of terms in the geometric sequence
        k = 3;
        // calculates the sum of the geometric series
        double geometricSum = g_1 * ((1 - Math.pow(r, k)) / (1 - r));
        // outputs the geometric sequence's start term and common ratio. then outputs its sum
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES\nThe sum of the first " + (int) k + " terms of a finite geometric series that starts with " + g_1 + " and increases by a rate of " + r + " is " + geometricSum);
    }
}

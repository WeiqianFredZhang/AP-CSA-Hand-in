import java.util.*;

public class Question2 {
    public static String goldbach(int n) {
        ArrayList<Integer> eratosthenes = new ArrayList<>(Question1.eratosthenes(n));
        for (int i = 0; i < (int) Math.ceil(eratosthenes.size() / 2.0); i++) {
            if (eratosthenes.contains(n - eratosthenes.get(i)))
                return Arrays.toString(new int[]{eratosthenes.get(i), n - eratosthenes.get(i)});
        }
        return Arrays.toString(new int[]{});
    }

    public static void main(String[] args) {
        System.out.println(goldbach(120));
    }
}

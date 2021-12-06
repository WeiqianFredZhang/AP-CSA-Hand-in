import java.util.*;

public class Question1 {
    public static ArrayList<Integer> eratosthenes(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            list.add(i);
        }
        for (int i = 2; i <= n; i++) {
            for (int j = i + i; j <= n; j += i) {
                list.remove((Integer) j);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(eratosthenes(100));
    }
}

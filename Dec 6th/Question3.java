import java.util.*;

class Question3 {
    public static ArrayList<Integer> add(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> small, large;
        if (a.size() > b.size()) {
            large = a;
            small = b;
        } else {
            large = b;
            small = a;
        }
        ArrayList<Integer> result = new ArrayList<>(large);
        for (int i = result.size() - 1, smallIndex = small.size() - 1; i >= 0; i--, smallIndex--) {
            if (smallIndex >= 0)
                result.set(i, result.get(i) + small.get(smallIndex));
            String cur = Integer.toString(result.get(i));
            if (cur.length() > 1) {
                result.set(i, Integer.parseInt(cur.split("")[1]));
                if (i == 0)
                    result.add(i, Integer.parseInt(cur.split("")[0]));
                else
                    result.set(i-1, result.get(i-1) + Integer.parseInt(cur.split("")[0]));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add((int) (Math.random() * 10));
        for (int i = 0; i < 4; i++) {
            a.add((int) (Math.random() * 10));
            b.add((int) (Math.random() * 10));
        }
        System.out.println(a + " + " + b + " = " + add(a,b));
    }
}

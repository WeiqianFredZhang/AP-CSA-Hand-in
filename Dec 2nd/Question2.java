import java.util.*;

class Question2 {

    public static void removeSmallest(ArrayList<Integer> nums) {
        //This method removes the smallest number in the list nums
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num < smallest) smallest = num;
        }
        while (nums.contains(smallest)){
            nums.remove((Integer) smallest);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nums.add((int) (Math.random() * 100));
        }

        System.out.println("Our list before: " + nums);
        removeSmallest(nums);
        System.out.println("Our list after:  " + nums);
    }
}

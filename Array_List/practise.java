import java.util.*;

public class practise{
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2,2,2,2,3));
        int key = 2;
        System.out.println(maxCount(nums, key)); // Output: 100
    }

    public static int maxCount(ArrayList<Integer> nums, int key) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                countMap.put(nums.get(i+1), countMap.getOrDefault(nums.get(i+1), 0) + 1);
            }
        }
        return Collections.max(countMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}

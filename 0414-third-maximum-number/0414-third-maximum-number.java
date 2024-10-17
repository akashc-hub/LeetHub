import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        // Step 1: Remove duplicates by converting array to a set
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums) {
            uniqueNums.add(num);
        }

        // Step 2: Convert set back to list and sort in descending order
        List<Integer> sortedList = new ArrayList<>(uniqueNums);
        Collections.sort(sortedList, Collections.reverseOrder());

        // Step 3: Check if there are at least 3 unique numbers
        if (sortedList.size() >= 3) {
            return sortedList.get(2); // Third largest element
        } else {
            return sortedList.get(0); // Largest element if less than 3 unique numbers
        }
    }
}

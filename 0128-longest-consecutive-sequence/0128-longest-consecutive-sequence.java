class Solution {
    public int longestConsecutive(int[] nums) {
        int max =0;
        Set<Integer> set1 = new HashSet<>();
        for(int i : nums)
        {
            set1.add(i);
        }
        for(int i : nums)
        {
            if(!set1.contains(i-1))
            {
                int start = i;
            
                while(set1.contains(start))
                {
                    start++;
                }
                max = Math.max(max, start-i);
            }
        }
        return max;
    }
}
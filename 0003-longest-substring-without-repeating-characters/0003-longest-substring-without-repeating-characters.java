class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int start = 0;
        int end = 0;
        int maxLen=0;

        Set<Character> set = new HashSet<>();

        while(end<n)
        {
            if(!set.contains(s.charAt(end)))
            {
                set.add(s.charAt(end));
                end++;
                maxLen = Math.max(maxLen, set.size());
            }
            else
            {
                set.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return maxLen;

    }
}
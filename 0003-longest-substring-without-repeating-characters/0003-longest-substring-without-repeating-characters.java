class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int start = 0;
        int end = 0;
        int maxLen=0;

        List<Character> list = new ArrayList<>();

        while(end<n)
        {
            if(!list.contains(s.charAt(end)))
            {
                list.add(s.charAt(end));
                end++;
                maxLen = Math.max(maxLen, list.size());
            }
            else
            {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return maxLen;

    }
}
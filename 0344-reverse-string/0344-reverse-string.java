class Solution {
    public void reverseString(char[] s) {
        // int start = 0; 
        int end = s.length-1;
       for(int start = 0; start<end; start++)
        {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            // start++;
            end--;
        }
    }
}
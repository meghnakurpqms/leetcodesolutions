class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), i = 0, j = 0, max = 0;
        HashSet<Character> set = new HashSet<Character>();
        while(i < n && j < n)
        {
            if(!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j++));
                max = Math.max(max,j-i);
            }
            else
            {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
}
class Solution {
    public int lengthOfLastWord(String s) {
        String s1 = s.trim();
        int newIndex = s1.lastIndexOf(' ');
        int len = s1.length();
        if(newIndex < 0) {
            return len;
        }
        return len - newIndex - 1;
    }
}
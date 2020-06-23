class Solution {
    public int strStr(String haystack, String needle) {
		// If there is no needle then return 0. Described in the problem statement. 
        if(needle.isEmpty())
            return 0;
        
		// If length of needle is greater than haystack then needle cannot exists in haystack.
        if(haystack.length() < needle.length())
            return -1;
        
		// For each character in haystack
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
			// Break haystack into sub-strings and compare the sub-string with needle.
            if(haystack.substring(i, i+needle.length()).equals(needle))
                return i;
        }
        
        return -1;
    }
}
//Adding comment for my own
// The below solution uses Java method, String: :substring( ) to divide the "haystack" into sub-strings of size equal to the "needle". It compares the sub-strings with "needle" and if any of them are equal, it returns 'true'.
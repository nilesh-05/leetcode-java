class Solution {
    public String convertToTitle(int n) {
          StringBuilder title = new StringBuilder();
        while (n > 0) { 
            int rem = n % 26; 
            if (rem == 0) { 
                title.append("Z"); 
                n = (n / 26) - 1; 
            } 
            else { 
                title.append((char)((rem - 1) + 'A')); 
                n = n / 26; 
            } 
        } 
        title = title.reverse();
        String newStr = title.toString();
        return newStr;
    }
}
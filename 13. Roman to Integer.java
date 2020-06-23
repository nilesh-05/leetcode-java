class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if((i!=s.length()-1) && (romanToInteger(ch)<romanToInteger(s.charAt(i+1))))
                result -= romanToInteger(ch);
            else 
                result += romanToInteger(ch);
        }
        return result;
    }
    public int romanToInteger(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}
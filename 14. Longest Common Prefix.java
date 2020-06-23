class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length ==0)     return "";
        String prefix = strs[0];//consider first element of the given array as prefix and then check whether the rest elements match it or not. 
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0,prefix.length() -1);//remove letter from end and check again
            }
        }
        return prefix;
    }
}
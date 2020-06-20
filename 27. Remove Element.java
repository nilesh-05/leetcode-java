class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums==null||nums.length==0)
		return 0;
	
	int mod=0,org=0;
    int len=nums.length;
	while(org<len){
		if(nums[org]!=val){
			nums[mod++]=nums[org];
		}
            org++;			
  	}
    return mod;
    }
}
class Solution {
    public boolean hasDuplicate(int[] nums) {
        int xor=0;
        boolean isDupe=false;
        Set<Integer> set= new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        
        if(set.size()!=nums.length) isDupe= true;
      return isDupe;
    }
}
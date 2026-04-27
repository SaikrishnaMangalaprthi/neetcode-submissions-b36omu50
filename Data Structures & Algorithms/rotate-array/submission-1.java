class Solution {
    public void rotate(int[] nums, int k) {
        int left=0;
        int right=nums.length-1;
        k=k%nums.length;
        while(left<right){
         int temp= nums[left];
         nums[left]=nums[right];
         nums[right]=temp;
         left++;
         right--;

        }
          int left1=0;
        int right1=k-1;
          while(left1<right1){
         int temp= nums[left1];
         nums[left1]=nums[right1];
         nums[right1]=temp;
         left1++;
         right1--;

        }  int left2=k;
        int right2=nums.length-1;
         while(left2<right2){
         int temp= nums[left2];
         nums[left2]=nums[right2];
         nums[right2]=temp;
         left2++;
         right2--;

        }
    }
}
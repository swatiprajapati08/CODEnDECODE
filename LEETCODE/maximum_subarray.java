/* Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle. */



class Solution {
    public int maxSubArray(int[] nums) {
          int size = nums.length; 
        int max= Integer.MIN_VALUE, maxe = 0; 
  
        for (int i = 0; i < size; i++) 
        { 
            maxe = maxe + nums[i]; 
            if (max < maxe) 
                max = maxe; 
            if (maxe < 0) 
                maxe = 0; 
        } 
        return max; 
    }
}

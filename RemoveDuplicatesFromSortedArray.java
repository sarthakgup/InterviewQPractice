/*
Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Good youtube video for more info on removing duplicates from sorted arrays: https://www.youtube.com/watch?v=rlfsnRY0S9k&feature=youtu.be
*/

class Solution
{
    public int removeDuplicates(int[] nums)
    {
        //checking corner case
        if (nums.length == 0)
        {
            return 0;
        }
        
        int i = 0;
        
        for (int j = 1; j < nums.length; j++)
        {
            if (nums[j] != nums[i])
            {
                i++;
                nums[i] = nums[j];
            }
        }
        
        //returning length
        //return nums.length;
        return i + 1;
    }
}

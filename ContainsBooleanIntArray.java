//  THIS PROGRAM IS STILL IN PROGRESS (8/12 test cases passing so far)
// from: https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/578/

/*
    Given an array of integers, find if the array contains any duplicates.

    Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
*/

class Solution
{
    public boolean containsDuplicate(int[] nums)
    {
        if(nums.length == 0)
        {
            return false;
        }
        
        int[] dupes = new int[nums.length];
        
        dupes[0] = nums[0];  // adding first element of nums in first element of array dupes
        
        // looping through each element in nums
        for(int i = 1; i < nums.length - 1; i++)
        {
            // checking if nums[i] is a duplicate
            for(int j = 0; j < dupes.length; j++)
            {
                if(dupes[j] == nums[i])
                {
                    return true;
                }
                
                dupes[i] = nums[j];
            }
        }
        
        return false;   // no dupes found
    }
}

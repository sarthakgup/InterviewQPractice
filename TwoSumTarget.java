/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/


public TwoSumTarget
{
    public static void main(String[] args)
    {
        twoSum({1,2,3}, 5);
    }

    public int[] twoSum(int[] nums, int target)
    {
        //int x = 0;
        int[] outputArr = new int[2];

        for(int x = 0; x < nums.length; x++)
        {
            for(int i = 1; i < nums.length; i++)
            {
                if((nums[x] + nums[i]) == target)
                {
                    outputArr[0] = x;
                    outputArr[1] = i;
                    return outputArr;
                }
            }

            x++;
        }
        
        return outputArr;

    }
}
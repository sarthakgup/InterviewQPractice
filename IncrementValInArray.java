/*
  Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

  The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

  You may assume the integer does not contain any leading zero, except the number 0 itself.
*/
//Found problem on LeetCode
//In PROGRESS: 91/114 test cases passed so far

class Solution
{
    public int[] plusOne(int[] digits)
    {
        int sum = 1;  //for finding exponent
        int[] finalArr = new int[digits.length];
        
        if(digits.length < 2)
        {
            int onlyVal = digits[0];
            onlyVal++;
            
            int[] outputArrTemp = new int[2];
            outputArrTemp[0] = onlyVal % 100;
            outputArrTemp[1] = onlyVal % 10;
            
            return outputArrTemp;
        }
        
        int lastVal = digits[digits.length - 1];
        
        lastVal++;
        
        digits[digits.length - 1] = lastVal;
        /*
        
        for(int i = 0; i < digits.length; i++)
        {
            //now a loop for the exponent
            for(int j = 0; j < i; j++)
            {
                sum = sum * 10;
            }
            
            finalsum += digits[i] * sum;
            sum = 0;
        }
        
        //adding 1
        finalsum++;
        
        //splitting into an array
        
        return finalsum;
        */
        
        return digits;
    }
}

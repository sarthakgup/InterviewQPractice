public class sortingPractice
{
    public static void main(String[] args)
    {
        int[] input = {1,2,4,5,3,6,4,7,5};
        int[] output = new int[input.length];
        output = bubbleSort(input);

        //printing output
        for(int i = 0; i < input.length; i++)
        {
            System.out.println(output[i]);
        }
    }

    public static int[] bubbleSort(int[] inputArr)
    {
        int[] original = inputArr;
        int[] temp = inputArr;
        boolean done = false; //boolean for if bubble sort has completed

        while(done != true)
        {
            original = inputArr;

            for(int i = 0; i < temp.length-1; i++)
            {
                if(temp[i+1] < temp[i])
                {
                    swap(temp, temp[i+1], temp[i]);
                }
            }

            //if no change made from original in entire pass, bubble is done
            if(original == temp)
            {
                done = true;
            }
        }


        return temp; 
    }

    public static void swap(int[] inputArr, int index1, int index2)
    {
        int temp = inputArr[index1];
        inputArr[index1] = inputArr[index2];
        inputArr[index2] = temp;
    }

    /*
    public static int[] quickSort(int[] inputArr)
    {
        
    }
    */
    


}

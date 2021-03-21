public class findDuplicates
{
    

    public static void main(String[] args)
    {
        int[] input = {1,2,1,3,1,2,3};       
        System.out.println("got: " + dupeFinder(input) +  ",  Expected: 3");

        int[] input2 = {0};       
        System.out.println("got: " + dupeFinder(input2) +  ",  Expected: 0");

        int[] input3 = {0,0,1,1,2,2,3,3,3};       
        System.out.println("got: " + dupeFinder(input3) +  ",  Expected: 4");
        assert dupeFinder(input3) == 4 : "expected 4";

        int[] input4 = {1,2,3,4};       
        System.out.println("got: " + dupeFinder(input4) +  ",  Expected: 0");

        int[] input5 = { };       
        System.out.println("got: " + dupeFinder(input5) +  ",  Expected: 0");

        int[] input6 = {0,1,2,3,0};       
        System.out.println("got: " + dupeFinder(input6) +  ",  Expected: 1");

    }

    public static int dupeFinder(int[] inputVals)
    {
        int totalDupes = 0;

        for(int i = 0; i < inputVals.length; i++)
        {
            int current = inputVals[i];

            for(int j = i+1; j < inputVals.length;j++)
            {
                if(inputVals[j] == current)
                {
                    totalDupes++;
                    break;
                }
            }
        }

        return totalDupes;
    }



        /*
        int totalDupes = 0;

        for(int a = 0; a < inputVals.length; a++)
        {
            //get first val
            int firstVal = inputVals[a];
            

            //get total # of occurrences
            int occurrences = 0;

            for(int b = 0; b < inputVals.length; b++)
            {
                //if(a==b)
                //{
                //    occurrences++;
                //}

                if((inputVals[b] == firstVal) && (a!=b))
                {
                    occurrences++;
                }
            }

            //decrement one for including firstVal
            //occurrences--;

            //divide by two for duplicates
            totalDupes += occurrences/2;

        }

        return totalDupes;
    }




        

        int counter = 0;
        int currentVal = inputVals[0];
        int pos = 0;

        for(int x = 0; x < inputVals.length; x++)
        {
            pos = x;
            currentVal = inputVals[x];

            for(int i = 0; i < inputVals.length; i++)
            {
                //pos=i;
                //currentVal = inputVals[i];

                if((currentVal == inputVals[i]) && (i != pos))
                {
                    counter++;
                    break;
                }  
            }
        }

        return counter;
    }*/
}
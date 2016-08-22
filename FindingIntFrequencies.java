import java.util.*;

public class FindingIntFrequencies 
{
	
	//the process
	
	public static int getFrequent(int arr[])
	{
		// create the place-holders needed
		int counter = 1, howManyTimes;
		// this will be returned
		int popular = arr[0];
		//initiate the 2nd counter
		howManyTimes = 0;
		
		// for each integer in array
		for (int i = 0; i <  (arr.length - 1); i++)
		{
			counter = arr[i];
			int nextIndex = 0;
			
			// to compare each value to the next one
			for (int j = 1; j < arr.length; j++)
			{
				if(nextIndex == arr[j])
				{
				howManyTimes++;
				}
				
				if(howManyTimes > counter)
				{
					popular = nextIndex;
					counter = howManyTimes;
				}
					
			}
			
					
			
		}
		return popular;
			
			
		
	}
	
	
	public static void main(String[] args) 
	
	//let's test it out
	
	// Assume the most frequent number isn't a tie
	
	{
		
		// create array
		int testArray[];
		
		// initiate array
		testArray = new int[20];
		
		// load data into array
		testArray[0] = 6;
		testArray[1] = 7;
		testArray[2] = 6;
		testArray[3] = 6;
		testArray[4] = 3;
		testArray[5] = 6;
		testArray[6] = 9;
		testArray[7] = 2;
		testArray[8] = 2;
		testArray[9] = 6;
		testArray[10] = 2;
		testArray[11] = 7;
		testArray[12] = 4;
		testArray[13] = 3;
		testArray[14] = 4;
		testArray[15] = 8;
		testArray[16] = 3;
		testArray[17] = 4;
		testArray[18] = 4;
		testArray[19] = 9;
		
		    
	    System.out.println(getFrequent(testArray));
	    
	}
	
}
		
	    
	   
   
	    
	    
		
	


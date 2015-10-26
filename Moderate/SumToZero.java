import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SumToZero {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split(",");
            int[] value=new int[input.length]; 
            for(int i=0;i<input.length;i++){
            	value[i]= Integer.parseInt(input[i]);
            }
            System.out.println(printCombination(value,value.length,4));
        }
    }
	private static int printCombination(int[] arr, int n, int r)
	{
		int[] data = new int[n];
	    return combinationUtil(arr, data, 0, n-1, 0, r);
	}

	private static int combinationUtil(int[] arr, int[] data, int start, int end, int index, int r)
	{
		int count=0;
	    if (index == r)
	    {
	    	int sum=0;
	        for (int j=0; j<r; j++)
	        	sum+=data[j];
	        
	        return sum==0?1:0;
	    }

	    for (int i=start; i<=end && end-i+1 >= r-index; i++)
	    {
	        data[index] = arr[i];
	        count+=combinationUtil(arr, data, i+1, end, index+1, r);
	    }
	    return count;
	}
}

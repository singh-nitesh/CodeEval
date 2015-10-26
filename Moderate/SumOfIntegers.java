import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SumOfIntegers {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split(",");
            int maxSum=-2147483648;
            for(int i=0;i<input.length;i++){
            	int sum = 0;
            	for(int j=i;j<input.length;j++){
            		sum+=Integer.parseInt(input[j]);
            		if(maxSum<sum){
                		maxSum=sum;
                	}
            	}
            }
            System.out.println(maxSum);
        }
    }
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class MiniumDistance {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input=line.split(" ");
            int[] values = new int[input.length-1];
            int minValue=10000;
            int maxValue=0;
            for(int i=1;i<input.length;i++){
            	values[i-1]=Integer.parseInt(input[i]);
            }
            for(int i=0;i<values.length-1;i++){
            	for(int j=i+1;j<values.length;j++){
            		if(values[i]>values[j]){
            			int temp = values[i];
            			values[i]=values[j];
            			values[j]=temp;
            		}
            	}
            }
            int mean = values[values.length/2];
            int result=0;
            for(int i=0;i<values.length;i++){
            	result+=Math.abs(mean-values[i]);
            }
            System.out.println(result);
        }
    }
}

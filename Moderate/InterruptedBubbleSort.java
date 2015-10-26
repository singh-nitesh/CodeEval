import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class InterruptedBubbleSort {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split(" \\| ")[0].split(" ");
            long val = 0;
            try{
            	val = Integer.parseInt(line.split(" \\| ")[1]);
            } catch(Exception e){
            	val = input.length;
            }
            long[] value = new long[input.length];
            for(int i=0;i<value.length;i++){
            	value[i]=Long.parseLong(input[i]);
            }
            if(val>value.length){
            	val = value.length;
            }
            for(int i=0;i<val;i++){
            	for(int j=0;j<value.length-1;j++){
            		if(value[j]>value[j+1]){
            			long temp = value[j];
            			value[j] = value[j+1];
            			value[j+1] = temp;
            		}
            	}
            }
            String result="";
            for(int i=0;i<value.length;i++){
            	result += value[i] + " ";
            }
            System.out.println(result.trim());
        }
    }
}

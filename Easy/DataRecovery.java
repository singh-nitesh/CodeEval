import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class DataRecovery {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	String[] input = line.split(";");
        	String[] value1 = input[0].split(" ");
        	String[] value2 = input[1].split(" ");
        	String[] result = new String[value1.length];
        	for(int i=0;i<value2.length;i++){
        		int val = Integer.parseInt(value2[i]);
        		result[val-1]=value1[i];
        	}
        	String output="";
        	for(int i=0;i<result.length;i++){
        		if(result[i]!=null){
        			output = output+result[i]+" ";
        		} else {
        			output = output+value1[result.length-1]+" ";
        		}
        	}
        	System.out.println(output.trim());
        }
    }
}

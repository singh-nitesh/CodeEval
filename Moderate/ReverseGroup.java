import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ReverseGroup {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split(";")[0].split(",");
            int length = Integer.parseInt(line.split(";")[1]);
            int i=0;
            int val = length;
            if(val>0){
	            while(val<=input.length){
	            	reverse(input,val-1,i);
	            	i=val;
	            	val+=length;
	            }
            }
            String result="";
            for(int j=0;j<input.length;j++){
            	result+=input[j]+",";
            }
            System.out.println(result.substring(0,result.length()-1));
        }
    }

	private static void reverse(String[] array,int val,int i){
        while(val>i){
        	String temp = array[val];
        	array[val] = array[i];
        	array[i] = temp;
        	val--;
        	i++;
        }
	}
}

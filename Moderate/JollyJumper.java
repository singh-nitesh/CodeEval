import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class JollyJumper {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split(" ");
            int length = Integer.parseInt(input[0]);
            int[] value = new int[length-1]; 
            boolean isJolly=true;
            for(int i=1;i<=length;i++){
            	if(i!=1){
            		int val = Math.abs(Integer.parseInt(input[i])-Integer.parseInt(input[i-1]));
            		if(val<length && val>0){
	            		if(value[val-1]!=-1){
	            			value[val-1]=-1;
	            		} else {
	            			isJolly=false;
	            			break;
	            		}
            		} else {
            			isJolly=false;
            			break;
            		}
            	}
            }
           
            System.out.println(isJolly?"Jolly":"Not jolly");
        }
    }
}

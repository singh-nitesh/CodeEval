import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class NumberPairs {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split(";")[0].split(",");
            int val = Integer.parseInt(line.split(";")[1]);
            String result="";
            for(int i=0;i<input.length-1;i++){
            	for(int j=i+1;j<input.length;j++){
                	if(Integer.parseInt(input[i])+Integer.parseInt(input[j])==val){
                		result+=input[i]+","+input[j]+";";
                	}
                }
            }
            System.out.println(result.length()>0?result.substring(0,result.length()-1):"NULL");
        }
    }
}

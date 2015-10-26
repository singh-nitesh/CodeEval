import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class DecimalToBinary {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int input = Integer.parseInt(line);
            String result="";
            for(int i=0;i<32;i++){
            	if(((input>>i)&1)==1){
            		result="1"+result;
            	} else{
            		result="0"+result;
            	}
            }
            String output="";
            boolean start=false;
            for(int i=0;i<result.length();i++){
            	if(result.charAt(i)=='1'){
            		output+=result.charAt(i);
            		start=true;
            	} else if(start){
            		output+=result.charAt(i);
            	}
            }
            System.out.println(output.length()>0?output:"0");
        }
    }
}

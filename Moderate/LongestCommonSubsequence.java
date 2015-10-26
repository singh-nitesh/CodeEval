import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LongestCommonSubsequence {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	if(line.trim().length()<=0){
        		continue;
        	}
            String[] input = line.split(";");
            int maxCount=0;
            String maxResult="";
            for(int k=0;k<input[0].length();k++){
            	int pos=0;
            	int count=0;
            	String result="";
	            for(int i=k;i<input[0].length();i++){
	            	char val = input[0].charAt(i);
	            	for(int j=pos;j<input[1].length();j++){
	            		if(val==input[1].charAt(j)){
	            			result+=val;
	            			count++;
	            			pos=j+1;
	            			break;
	            		}
	            	}
	            }
	            if(count>maxCount){
            		maxCount=count;
            		maxResult=result;
            	}
            }
            System.out.println(maxResult.trim());
        }
    }
}

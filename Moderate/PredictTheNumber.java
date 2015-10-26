import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PredictTheNumber {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String result= "01121220";
        while ((line = buffer.readLine()) != null) {
            long val = Integer.parseInt(line);
            int diff = (int)(val%4);
            val = val-diff;
            long div=0;
            for(long i=0;val>3;i++){
            	val = val/2;
            	div=i+1;
            }
            val=val+diff;
            char res = result.charAt((int)val);
            if(div%3==1){
            	if(res=='0'){
            		res='1';
            	} else if(res=='1'){
            		res='2';
            	} else if(res=='2'){
            		res='0';
            	}
            } else if(div%3==2){
            	if(res=='0'){
            		res='2';
            	} else if(res=='1'){
            		res='0';
            	} else if(res=='2'){
            		res='1';
            	}
            }
            	
            System.out.println(res); 
        }
    }
}

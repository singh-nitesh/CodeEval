import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FlaviousJoseph {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int length = Integer.parseInt(line.split(",")[0]);
            int val = Integer.parseInt(line.split(",")[1]);
            int[] value = new int[length];
            int count=1;
            int totalDead=0;
            int i=0;
            String result="";
            while(totalDead!=length){
            	if(value[i]!=-1){
	            	if(count==val){
	            		result+=i+" ";
	            		value[i] = -1;
	            		count=1;
	            		totalDead++;
	            	} else {
	            		count++;
	            	}
            	}
            	i++;
            	if(i==length){
            		i=0;
            	}
            }
            System.out.println(result.trim());
        }
    }
}

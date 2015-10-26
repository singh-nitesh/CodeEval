import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ChardonayAndCabernet {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String input = line.split(" \\| ")[0];
            String mask = line.split(" \\| ")[1];
            String[] strings = input.split(" ");
            String result="";
            for(int i=0;i<strings.length;i++){
            	String val=strings[i];
            	int count=0;
            	for(int j=0;j<mask.length();j++){
            		if(val.contains(mask.substring(j,j+1))){
            			int k = val.indexOf(mask.substring(j,j+1));
            			if(k!=val.length()-1)
            				val=val.substring(0,k)+val.substring(k+1,val.length());
            			else
            				val=val.substring(0,k);
            			count++;
            		} else {
            			break;
            		}
            	}
            	if(count>=mask.length()){
            		result+=strings[i]+" ";
            	}
            }
            System.out.println(result.length()==0?"False":result.trim());
        }
    }
}

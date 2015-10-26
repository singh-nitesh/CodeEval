import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class AlphabetBlocks {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String in = line.split(" \\| ")[1];
            String[] val = line.split(" \\| ")[2].split(" ");
            int count=0;
            for(int k=0;k<val.length;k++){
            	count=0;
            	int i=k;
            	int circle=0;
            	String input = in;
            	while(true){
            		for(int j=0;j<input.length();j++){
            			if(val[i].contains(String.valueOf(input.charAt(j)))){
            				input=input.substring(0,j)+0+input.substring(j+1);
            				count++;
            				break;
            			}
            		}
            		circle++;
            		if(circle==val.length){
            			break;
            		}
            		if(i==val.length-1){
            			i=0;
            		} else {
            			i++;
            		}
            	}
            	if(count>=input.length()){
            		break;
            	}
            }
            System.out.println(count>=in.length()?"True":"False");
        }
    }
}

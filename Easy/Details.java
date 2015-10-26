import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Details {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input=line.split(",");
            int result=10;
            for(int i=0;i<input.length;i++) {
            	int total=0;
            	char initialChar='X';
            	for(int j=0;j<input[i].length();j++){
                	if(input[i].charAt(j)=='.' && (input[i].charAt(j-1)=='X' || input[i].charAt(j-1)=='.') ){
                		total++;
                	}
                }
            	if(total<result) {
            		result=total;
            	}
            }
            System.out.println(result);
        }
    }
}

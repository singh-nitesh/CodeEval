import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ArrayAbsurdity {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split(";")[1].split(",");
            int length = Integer.parseInt(line.split(";")[0]);
            int[] val = new int[length-1];
            for(int i=0;i<length;i++){
            	if(val[Integer.parseInt(input[i])]!=-1){
            		val[Integer.parseInt(input[i])]=-1;
            	} else {
            		System.out.println(input[i]);
            		break;
            	}
            }
        }
    }
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SwapElements {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
           String[] array= line.split(" : ")[0].split(" ");
           String[] replace = line.split(" : ")[1].split(", ");
           for(int i=0;i<replace.length;i++){
        	   int loc1=Integer.parseInt(replace[i].split("-")[0]);
        	   int loc2=Integer.parseInt(replace[i].split("-")[1]);
        	   String temp = array[loc1];
        	   array[loc1] = array[loc2];
        	   array[loc2] = temp;
           }
           String result="";
           for(int i=0;i<array.length;i++){
        	   result +=  array[i] + " ";
           }
           System.out.println(result.trim());
        }
    }
}

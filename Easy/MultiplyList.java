import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class MultiplyList {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
           String[] array1= line.split(" \\| ")[0].split(" ");
           String[] array2 = line.split(" \\| ")[1].split(" ");
           String result = "";
           for(int i=0;i<array1.length;i++){
        	   result+=Integer.parseInt(array1[i])*Integer.parseInt(array2[i])+" ";
           }
           System.out.println(result.trim());
        }
    }
}

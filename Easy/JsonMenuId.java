import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class JsonMenuId {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	String str = line.trim();
        	String str1 = str.substring(str.indexOf("\"items\": [") + 10, str.indexOf("]}}"));
        	String[] value = str1.split("}, ");
        	int result=0;
        	for(String val : value){
        		if(!val.equalsIgnoreCase("null") && val.contains("\"label\"")){
        			result+=Integer.parseInt(val.substring(val.indexOf("\"id\": ") + 6, val.indexOf(", \"label\"")));
        		}
        	}
        	System.out.println(result);
        }
    }
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class URIComparision {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] inputs = line.split(";");
            for(int i=0;i<2;i++){
            	while(inputs[i].contains("%")){
            		int val = Integer.parseInt(inputs[i].substring(inputs[i].indexOf("%")+1, inputs[i].indexOf("%")+3),16);
            		inputs[i]= inputs[i].substring(0,inputs[i].indexOf("%"))+(char)val+inputs[i].substring(inputs[i].indexOf("%")+3);
            	}
            	if(inputs[i].contains(":80")){
            		inputs[i]= inputs[i].substring(0,inputs[i].indexOf(":80"))+inputs[i].substring(inputs[i].indexOf(":80")+3);
            	}
            }
            System.out.println(inputs[0].equalsIgnoreCase(inputs[1])?"True":"False");
        }
    }
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class TheMinisteryOfTruth {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	if(line.split(";").length>1){
        		String[] input = line.split(";")[0].split(" ");
	            String[] vals = line.split(";")[1].split(" ");
	            String result="";
	            int j=0;
	            for(int i=0;i<input.length;i++){
	            	if(!input[i].equals(""))
		            	if(j!=vals.length && input[i].contains(vals[j])){
		            		result+=input[i].substring(0,input[i].indexOf(vals[j])).replaceAll(".", "_") +vals[j]+ input[i].substring(input[i].indexOf(vals[j])+vals[j].length()).replaceAll(".", "_")+" ";
		            		j++;
		            	} else {
		            		result+=input[i].replaceAll(".", "_")+" ";
		            	}
	            }
	            System.out.println(j==vals.length?result:"I cannot fix history");
            } else {
            	System.out.println("I cannot fix history");
            }
        }
    }
}

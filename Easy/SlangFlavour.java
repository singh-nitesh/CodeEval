import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SlangFlavour {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        boolean isAlternate=false;
        String[] slags= ", yeah!;, this is crazy, I tell ya.;, can U believe this?;, eh?;, aw yea.;, yo.;? No way!;. Awesome!".split(";");
        int slagIndex = 0;
        while ((line = buffer.readLine()) != null) {
        	String result="";
        	for(int i=0;i<line.length();i++){
        		char val = line.charAt(i);
        		if(val=='!' || val=='.' || val=='?'){
        			if(isAlternate){
        				result+=slags[slagIndex];
        				isAlternate=false;
        				if(slagIndex==7){
        					slagIndex=0;
        				}else{
        					slagIndex++;
        				}
        			} else {
        				result+=val;
        				isAlternate = true;
        			}
        		} else {
        			result+=val;
        		}
        	}
        	System.out.println(result);
        }
    }
}

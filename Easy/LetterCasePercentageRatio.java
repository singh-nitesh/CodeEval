import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LetterCasePercentageRatio {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            float uppercount=0;
            float lowercount=0;
            for(int i=0;i<line.length();i++){
            	char val = line.charAt(i);
            	if(val>=65 && val<=90){
            		uppercount++;
            	} else if (val>=97 && val<=122){
            		lowercount++;
            	}
            }
            double upperPer = Math.round((uppercount*100/(uppercount+lowercount))*100.0)/100.0;
            double lowerPer = Math.round((lowercount*100/(uppercount+lowercount))*100.0)/100.0;
            
            System.out.println("lowercase: "+format(lowerPer)+" uppercase: "+format(upperPer));
        }
    }
	
	private static String format(double val){
		String value= String.valueOf(val);
		if(value.split("\\.")[1].length()<2){
			value+="0";
		}
		return value;
	}
}

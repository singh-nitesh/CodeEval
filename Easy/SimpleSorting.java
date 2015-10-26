import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;


public class SimpleSorting {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input= line.trim().split(" ");
            float[] inputInt=new float[input.length];
            for(int i=0;i<input.length;i++){
            	inputInt[i]=Float.parseFloat(input[i]);
            }
            for(int i=0;i<inputInt.length-1;i++){
            	for(int j=i+1;j<inputInt.length;j++){
            		if(inputInt[i]>inputInt[j]){
            			float temp = inputInt[i];
            			inputInt[i]=inputInt[j];
            			inputInt[j]=temp;
            		}
            	}
            }
            String result="";
            for(int i=0;i<inputInt.length;i++){
            	result=result+format(inputInt[i])+" ";
            }
            System.out.println(result.trim());
        }
    }
	
	private static String format(float a){
		String value = String.valueOf(a);
		String decimal= value.split("\\.")[1];
		if(decimal.length()==3){
			return value;
		} else if(decimal.length()==2){
			return value+"0";
		} else if(decimal.length()==1){
			return value+"00";
		} else {
			return value+".000";
		}
	}
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LongestLine {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int count=0;
        int num=0;
        String values="";
        while ((line = buffer.readLine()) != null) {
        	if(count==0){
        		num = Integer.parseInt(line);
        		count++;
        	}else{
        		values+=line+"_"+line.length()+";";
        	}
        }
        String[] inputs=values.split(";");
        String[] inputString= new String[inputs.length];
        int[] inputCount = new int[inputs.length];
        for(int i=0;i<inputs.length;i++){
        	inputString[i]=inputs[i].split("_")[0];
        	inputCount[i]=Integer.parseInt(inputs[i].split("_")[1]);
        }
        for(int i=0;i<num;i++){
        	for(int j=i+1;j<inputCount.length;j++){
        		if(inputCount[i]<inputCount[j]){
        			int temp = inputCount[i];
        			inputCount[i]=inputCount[j];
        			inputCount[j]=temp;
        			String tem = inputString[i];
        			inputString[i]=inputString[j];
        			inputString[j]=tem;
        		}
        	}
        	System.out.println(inputString[i]);
        }
    }
}

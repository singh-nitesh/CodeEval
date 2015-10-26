import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class MixedContents {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
           String[] array1= line.split(",");
           String stringResult=""; 
           String numResult="";
           for(int i=0;i<array1.length;i++){
        	   try{
        		   Integer.parseInt(array1[i]);
        		   numResult+=array1[i]+",";
        	   } catch (NumberFormatException ex) {
        		   stringResult+=array1[i]+",";
        	   }
           }
           if (numResult.length()==0 || stringResult.length()==0){
        	   System.out.println(line);
        	   continue;
           }
           
           if(stringResult.length()>0)
        	   stringResult=stringResult.substring(0, stringResult.length()-1);

           if(numResult.length()>0)
        	   numResult=numResult.substring(0, numResult.length()-1);
           
           System.out.println(stringResult+"|"+numResult);
        }
    }
}

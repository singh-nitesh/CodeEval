import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class WordToDigit {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
           String[] inputs = line.trim().split(";");
           String result="";
           for(String input : inputs){
        	   if(input.equalsIgnoreCase("zero")){
        		   result=result+0;
        	   } else if(input.equalsIgnoreCase("one")){
        		   result=result+1;
        	   }else if(input.equalsIgnoreCase("two")){
        		   result=result+2;
        	   }else if(input.equalsIgnoreCase("three")){
        		   result=result+3;
        	   }else if(input.equalsIgnoreCase("four")){
        		   result=result+4;
        	   }else if(input.equalsIgnoreCase("five")){
        		   result=result+5;
        	   }else if(input.equalsIgnoreCase("six")){
        		   result=result+6;
        	   }else if(input.equalsIgnoreCase("seven")){
        		   result=result+7;
        	   }else if(input.equalsIgnoreCase("eight")){
        		   result=result+8;
        	   }else if(input.equalsIgnoreCase("nine")){
        		   result=result+9;
        	   }
           }
           System.out.println(result);
        }
    }
}

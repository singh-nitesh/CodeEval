import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class BigDigit {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String[] digitString="-**----*--***--***---*---****--**--****--**---**--;*--*--**-----*----*-*--*-*----*-------*-*--*-*--*-;*--*---*---**---**--****-***--***----*---**---***-;*--*---*--*-------*----*----*-*--*--*---*--*----*-;-**---***-****-***-----*-***---**---*----**---**--;--------------------------------------------------".split(";");
        while ((line = buffer.readLine()) != null) {
        	String digit="";
        	for(int i=0;i<line.length();i++) {
        		char val= line.charAt(i);
        		if(val>=48 && val<=57){
        			digit += Integer.parseInt(String.valueOf(val));
        		}
        	}
        	for(int i=0;i<digitString.length;i++) {
        		for(int j=0;j<digit.length();j++) {
            		int val = Integer.parseInt(String.valueOf(digit.charAt(j)));
            		System.out.print(digitString[i].substring((val*5),(val*5)+5));
            	}
        		System.out.println();
        	}
        }
    }
}

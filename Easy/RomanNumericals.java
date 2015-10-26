import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class RomanNumericals {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	int base=line.length();
        	String result="";
        	for(int i=0;i<line.length();i++){
        		int val=Integer.parseInt(line.substring(i,i+1));
        		if(base==4){
        			for(int j=0;j<val;j++)
        				result +="M"; 
        		} else if(base==3) {
        			if(val<=3){
        				for(int j=0;j<val;j++)
            				result +="C"; 
        			}else if(val==4){
        				result +="CD";
        			}else if(val==5){
        				result +="D";
        			}else if(val<=8){
        				result +="D";
        				val-=5;
        				for(int j=0;j<val;j++)
            				result +="C"; 
        			}else if(val==9){
        				result +="CM"; 
        			}
        		} else if(base==2) {
        			if(val<=3){
        				for(int j=0;j<val;j++)
            				result +="X"; 
        			}else if(val==4){
        				result +="XL";
        			}else if(val==5){
        				result +="L";
        			}else if(val<=8){
        				result +="L";
        				val-=5;
        				for(int j=0;j<val;j++)
            				result +="X"; 
        			}else if(val==9){
        				result +="XC"; 
        			}
        		} else if(base==1) {
        			if(val<=3){
        				for(int j=0;j<val;j++)
            				result +="I"; 
        			}else if(val==4){
        				result +="IV";
        			}else if(val==5){
        				result +="V";
        			}else if(val<=8){
        				result +="V";
        				val-=5;
        				for(int j=0;j<val;j++)
            				result +="I"; 
        			}else if(val==9){
        				result +="IX"; 
        			}
        		}
        		base--;
        	}
        	System.out.println(result);
        	
        }
    }
}

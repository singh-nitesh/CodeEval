import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class BalancedSmilyes {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	int[] stack = new int[line.length()];
        	int top=-1;
        	boolean result=true;
        	while(line.contains("(:)")){
        		line = line.replace("(:)", "");
        	}
            for(int i=0;i<line.length();i++){
            	if(line.charAt(i)=='('){
            		if(i==0){
            			top++;
                		stack[top]='(';
            		}else if(line.charAt(i-1)!=':'){
            			top++;
                		stack[top]='(';
            		}
            	}
            	if(line.charAt(i)==')'){
            		if(i==0){
            			result=false;
            			break;
            		}else if(line.charAt(i-1)!=':'){
            			if(top>-1){
                			top--;
                		} else {
                			result=false;
                			break;
                		}
            		}           		
            	}
            }
            if(top!=-1){
            	result=false;
            }
            System.out.println(result?"YES":"NO");
        }
    }
}
